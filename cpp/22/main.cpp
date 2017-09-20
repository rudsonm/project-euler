#include <iostream>
#include <fstream>
#include <vector>

using namespace std;

vector<string> split(const string& line, char character) {
	vector<string> result;
    int start = 0, end;
    string name;
	do {
        end = line.find(character, start + 1);
        name = line.substr(start + 1, end - start - 1);
        result.push_back(name);
        start = line.find(character, end + 1);
	} while (start != -1 && end != -1);
	return result;
}

int main() {
    ifstream file("names.txt");
    string line;
    getline(file, line);
    vector<string> names = split(line, '"');
    for(int i = 0; i < names.size(); i++)
        cout << names[i] << endl;
}