class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        lt = [i for i in s if 'a' <= i <= 'z' or '0' <= i <= '9']
        return lt == lt[::-1]