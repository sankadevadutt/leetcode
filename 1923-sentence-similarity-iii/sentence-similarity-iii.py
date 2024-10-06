class Solution:
    def areSentencesSimilar(self, sentence1: str, sentence2: str) -> bool:
        # Split sentences into words
        words1 = sentence1.split()
        words2 = sentence2.split()

        # Ensure sentence1 is the shorter one
        if len(words1) > len(words2):
            words1, words2 = words2, words1

        # Match words from the beginning
        start = 0
        while start < len(words1) and words1[start] == words2[start]:
            start += 1

        # Match words from the end
        end = 0
        while end < len(words1) - start and words1[-(end + 1)] == words2[-(end + 1)]:
            end += 1

        # Check if all unmatched words in sentence2 are grouped together
        return start + end >= len(words1)