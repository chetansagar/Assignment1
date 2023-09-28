# Assignment1
Fermat's Last Theorem

1 jar file is uploaded
.Java file containing the program is uploaded.

In this program our task was to compute every possible combination of x and y in the range of K, and try to find out the near miss, relative miss and smallest miss from all the combination.
user inputs are for K which is range, and n which is power. Then Applied nested for loop with respect to x and y, and it starts from lower limit and goes until the upper limit, in this way 
every possible combination of x and y will be computed. We performed the computation x^n + y^n and then take the nth root of its value and we get the value for z. Then we find the near miss
by subtracting z from x^n + y^n, and subtracting x^n + y^n from (z+1)^n. Then according to given formula in assignment's instruction we find the relative miss and in the end by comparing the
values of near miss we find the Smallest miss.
