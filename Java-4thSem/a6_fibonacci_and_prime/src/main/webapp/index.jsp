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
            int[] fib = new int[10];
            fib[0] = 0;
            fib[1] = 1;
            for(int i = 2; i < 10; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            int[] primes = new int[10];
            int c = 0;
            int n = 2;
            while(c < 10) {
                boolean isPrime = true;
                for(int i = 2; i < Math.sqrt(n); i++) {
                    if(n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    primes[c++] = n;
                }
                n++;
            }
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