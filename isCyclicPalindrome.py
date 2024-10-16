def isPalindrome(s):
    return s == s[::-1]

def  isCyclicPalindrome(s):
    right_shift_count = 0
    left_shift_count = 0
    for i in range(len(s)):
        right_shifts = s[i:] + s[:i]
        right_shift_count += 1
        left_shift = s[len(s)-i:] + s[:len(s)-i]
        left_shift_count += 1
        if(isPalindrome(right_shifts)):
            return right_shift_count,'r'
        if(isPalindrome(left_shift)):
            return left_shift_count,'l'
    return False

s = input("Enter : ")
r = isCyclicPalindrome(s)
if r[0] :
    if r[1] == 'r':
        print(1,'number of shits is' ,r[0],'from right shifting')
    else:
        print(1,'number of shits is' ,r[0],'from left shifting')
else:
    
    print("No cyclic Palindrome is found")