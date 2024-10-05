class Solution(object):
    def checkInclusion(self, s1, s2):
        
        ns1 = len(s1)
        ns2 = len(s2)

        # if ns1 small
        freq_map_s1 = {}

        for i in range(ns1):
            if s1[i] in freq_map_s1 : 
                freq_map_s1[s1[i]] += 1
            else:
                freq_map_s1[s1[i]] = 1

        for i in range(ns2 - ns1 + 1):
            freq_map_s2 = {}
            for j in range(ns1):
                if s2[i + j] in freq_map_s2 : 
                    freq_map_s2[s2[i + j]] += 1
                else:
                    freq_map_s2[s2[i + j]] = 1

            if self.check_equal(freq_map_s2, freq_map_s1):
                return True

        return False

    def check_equal(self, freq_map1, freq_map2):
        if len(freq_map1) != len(freq_map2):
            return False

        for key in freq_map1:
            if key not in freq_map2 or freq_map1[key] != freq_map2[key]:
                return False
        return True