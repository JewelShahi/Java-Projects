//sum of two numbers in binary
#include <iostream>
std::string add_binary(uint64_t a, uint64_t b) {
  std::string print = "";
  std::string result = "";
  uint64_t res = a + b;
  if (res == 0) {
    return "0";
  } else {
    while (res != 0) {
      if (res % 2 == 0)
        result += "0";
      else
        result += "1";
      res = res / 2;
    }
    for (int i = result.length() - 1; i >= 0; i--) {
      print += result.at(i);
    }
  }
  return print;
}
int main() {
  int a = 0, b = 0;
  std::cout << "Enter a number:\n";
  std::cin >> a;
  std::cout << "\nEnter a another number:\n";
  std::cin >> b;
  std::cout << "\nThe sum of these numbers in binary is:\n"<< add_binary(a, b) << std::endl;
  return 0;
}
