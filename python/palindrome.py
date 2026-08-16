#this is for leetcode so no need to take input from user
#check if a number is a palindrome or not if not return false else return true

class Solution(object):
    def isPalindrome(self, num):
        n = num
        rev = 0

        while num > 0:
            rem = num % 10
            rev = rev * 10 + rem
            num = num // 10

        if n == rev:
            return True
        else:
            return False