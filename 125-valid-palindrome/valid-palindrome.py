class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        lt = [i for i in s if i.isalnum()]
        return lt == lt[::-1]