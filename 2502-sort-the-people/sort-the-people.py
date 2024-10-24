class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        lt = [(-heights[i],names[i]) for i in range(len(names))]
        lt.sort(key=lambda x:(x[0],x[1]))

        return [i[1] for i in lt]
