# Number_Chains
Code for Number Chains

Given a number, we can form a number chain by 

1.	arranging its digits in descending order
2.	arranging its digits in ascending order
3.	subtracting the number obtained in (2) from the number obtained (1) to form a new number
4.	and repeat these steps unless the new number has already appeared in the chain 

Note that 0 is a permitted digit. The number of distinct numbers in the chain is the length of the chain. You are to write a program that reads numbers and outputs the number chain and the length of that chain for each number read. 

Input and Output

The input consists of a sequence of positive numbers, all less than  , each on its own line, terminated by 0. The input file contains at most 5000 numbers. 

The output consists of the number chains generated by the input numbers, followed by their lengths exactly in the format indicated below. After each number chain and chain length, including the last one, there should be a blank line. No chain will contain more than 1000 distinct numbers. 

    Sample Input

    123456789
    1234
    444
    0

    Sample Output

    Original number was 123456789
    987654321 - 123456789 = 864197532
    987654321 - 123456789 = 864197532
    Chain length 2

    Original number was 1234
    4321 - 1234 = 3087
    8730 - 378 = 8352
    8532 - 2358 = 6174
    7641 - 1467 = 6174
    Chain length 4

    Original number was 444
    444 - 444 = 0
    0 - 0 = 0
    Chain length 2
