import subprocess
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]


def run_script(name, stdin=""):
    result = subprocess.run(
        ["bash", str(ROOT / "bash" / name)],
        input=stdin,
        text=True,
        capture_output=True,
        check=True,
    )
    return result.stdout.strip()


class BashSolutionTests(unittest.TestCase):
    def test_personalized_echo(self):
        self.assertEqual(run_script("a_personalized_echo.sh", "Ada\n"), "Welcome Ada")

    def test_number_comparison_covers_all_branches(self):
        cases = {
            "2\n5\n": "X is less than Y",
            "8\n3\n": "X is greater than Y",
            "4\n4\n": "X is equal to Y",
        }
        for stdin, expected in cases.items():
            with self.subTest(stdin=stdin):
                self.assertEqual(run_script("comparing_numbers.sh", stdin), expected)


if __name__ == "__main__":
    unittest.main()
