def helper(str):
    str = str.lower()
    vowels = 0
    consonants = 0
    char_counts = {}

    for char in str:
        if char in "aeiou":
            if char not in char_counts:
                vowels += 1
                char_counts[char] = 0
        elif char.isalpha():
            if char not in char_counts:
                consonants += 1
                char_counts[char] = 0

    return vowels == consonants


string = input()
result = helper(string)

if result:
    print("true")
else:
    print("false")
