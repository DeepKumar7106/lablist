<!-- #6 Write a JSP program to print first 10 Fibonacci and 10 prime numbers. -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Finonacci and Prime</title>
</head>
<body>
    <h2>First 10 Fibonacci and Primes</h2>
    <table>
        <tr>
            <td>Sl No.</td>
            <td>Fibonacci</td>
            <td>Prime</td>
        </tr>
        <% 
        /* --- STEP 1: CALCULATE FIBONACCI SERIES --- */
        int[] fib = new int[10];
        fib[0] = 0; // First number is always 0
        fib[1] = 1; // Second number is always 1
        
        // Loop starts from index 2; each number is the sum of the previous two
        for(int i = 2; i < 10; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        /* --- STEP 2: CALCULATE PRIME NUMBERS --- */
        int[] primes = new int[10];
        int count = 0; // Keeps track of how many primes we have found
        int num = 2;   // The number we are currently testing (starting from 2)

        while(count < 10) {
            boolean isPrime = true;
            
            // Check if 'num' is divisible by any number from 2 up to its square root
            // We use <= because for 9, sqrt is 3; if we use <, we miss checking 3.
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false; // Found a factor, so not prime
                    break;           // Exit inner loop early for efficiency
                }
            }
            
            // If no factors were found, add it to our array
            if(isPrime) {
                primes[count++] = num; // Add to array and increment count
            }
            num++; // Move to the next number to test
        }

        /* --- STEP 3: OUTPUT DATA TO TABLE --- */
        // We loop 10 times to create 10 table rows
        for(int i = 0; i < 10; i++) {
        %>
            <tr>
                <td><%=(i + 1) %></td>
                <td><%=fib[i] %></td>
                <td><%=primes[i] %></td>
            </tr>
        <% } %>
        </table>
    </body>
</html>

<!--            OUTPUT          -->

<!-- First 10 Fibonacci and Primes
Sl No.	Fibonacci	Prime
1	0	2
2	1	3
3	1	5
4	2	7
5	3	11
6	5	13
7	8	17
8	13	19
9	21	23
10	34	29 -->