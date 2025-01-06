class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        lt = [i for i in range(0, len(boxes)) if boxes[i] == '1']
        ans = []

        for i in range(0,len(boxes)):
            count = 0
            for j in lt:
                count += abs(i-j)
            ans.append(count)

        return ans
        