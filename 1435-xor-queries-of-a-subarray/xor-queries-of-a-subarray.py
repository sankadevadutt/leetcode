class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        ans = []
        dic = {}
        for query in queries:
            if (query[0], query[1]) in dic:
                ans.append(dic[(query[0], query[1])])
            else:
                left = query[0]
                right = query[1]
                val = arr[right]
                for i in range(left, right):
                    val = val ^ arr[i]
                dic[(left,right)] = val
                ans.append(val)

        return ans


