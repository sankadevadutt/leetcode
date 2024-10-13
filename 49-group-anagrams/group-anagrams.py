class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for i in strs:
            str2 = ''.join(sorted(i))
            if str2 not in dic:
                dic[str2] = []
            dic[str2].append(i)

        return [i for i in dic.values()]