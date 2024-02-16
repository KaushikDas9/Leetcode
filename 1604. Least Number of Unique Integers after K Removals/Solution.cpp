#include <vector>
#include <unordered_map>
#include <algorithm>

class Solution {
public:
    int findLeastNumOfUniqueInts(std::vector<int>& arr, int k) {
        std::unordered_map<int, int> freqMap;

        // Count the frequency of each element in the array
        for (int num : arr) {
            freqMap[num]++;
        }

        // Store frequencies in a vector
        std::vector<int> frequencies;
        for (const auto& entry : freqMap) {
            frequencies.push_back(entry.second);
        }

        // Sort frequencies in ascending order
        std::sort(frequencies.begin(), frequencies.end());

        // Iterate through frequencies and decrement k
        int uniqueCount = frequencies.size();
        for (int freq : frequencies) {
            if (k >= freq) {
                k -= freq;
                uniqueCount--;
            } else {
                break;
            }
        }

        return uniqueCount;
    }
};
