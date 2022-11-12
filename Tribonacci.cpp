//tribonacci sequence with custom signature and size all entered from the user
#include <iostream>
#include <sstream>
#include <vector>
std::string printSequence(std::vector<int> n) {
  std::string saver = "[";
  for (int i = 0; i < n.size(); i++) {
    if (i == n.size() - 1) {
      std::stringstream s;
      s << n[i];
      saver += s.str() + "]";
    } else {
      std::stringstream s;
      s << n[i];
      saver += s.str() + ", ";
    }
  }
  return saver;
}
std::vector<int> Tribonacci(std::vector<int> signature, int n) {
  std::vector<int> result;
  if (n <= 3) {
    switch (n) {
    case 0:
      return result;
      break;
    case 1:
      result.clear();
      result.push_back(signature.at(0));
      return result;
      break;
    case 2:
      result.clear();
      for (int i = 0; i < 2; i++)
        result.push_back(signature.at(i));
      return result;
      break;
    default:
      result.clear();
      for (int i = 0; i < 3; i++)
        result.push_back(signature.at(i));
      return result;
      break;
    }
  } else {
    for (int i : signature)
      result.push_back(i);
    for (int i = 2; i < n - 1; i++) {
      result.push_back(result.at(i - 2) + result.at(i - 1) + result.at(i));
    }
  }
  return result;
}
int main() {
  int saver = 0;
  std::vector<int> v;
  std::cout << "Enter 3 numbers for starting the tribonacci sequence:\n";
  for (int i = 0; i < 3; i++) {
    std::cin >> saver;
    v.push_back(saver);
  }
  std::cout << "Enter the size of the series:\n";
  std::cin >> saver;
  std::cout << "The series of tribonacci with signature " << printSequence(v) << " is " << printSequence(Tribonacci(v, saver)) << std::endl;
  return 0;
}
