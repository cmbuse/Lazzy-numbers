# Lazzy-numbers
 Modele de optimizare:

- Modelul Lazy evaluation asigură faptul că oricare algoritm intens computațional este executat doar dacă / atunci când utilizatorul solicită rezultatul.

- Mecanismul de Caching realizează stocarea rezultatului pentru oricare algoritm intens computațional (i.e. după execuția acestuia).
Astfel, rezultatul memorat este disponibil pe viitor, dacă utilizatorul efectuează din nou aceeași interogare, și poate fi returnat direct
(i.e. fără a executa din nou algoritmul în cauză)
Exemplu de rulare:
LazyNumberDetails lnd;
lnd = new LazyNumberDetails(23); // (1) **none (lazy eval.)** -> no user action
 
// User instruction        |    What happens?            |  Explanation            
lnd.updateNumber(10); // (2)  **none (lazy eval.)**    -> no user action
lnd.updateNumber(17); // (3)  **none (lazy eval.)**    -> no user action
lnd.isPrime();        // (4)  !!intensiveComputation!! -> prime algorithm for 17
lnd.isPrime();        // (5)  **cached**               -> saved result from prime alg
lnd.updateNumber(28); // (6)  **none (lazy eval.)**    -> no user action
lnd.isPerfect();      // (7)  !!intensiveComputation!! -> perfect algorithm for 28
lnd.isPrime();        // (8)  !!intensiveComputation!! -> prime algorithm for 28
lnd.isPerfect();      // (9)  **cached**               -> saved result from perfect alg
lnd.isMagic();        // (10) !!intensiveComputation!! -> magic algorithm for 28
lnd.isPrime();        // (11) **cached**               -> saved result from prime alg
lnd.updateNumber(12); // (12) **none (lazy eval.)**    -> no user action
lnd.isMagic();        // (13) !!intensiveComputation!! -> magic algorithm for 12
lnd.isMagic();        // (14) **cached**               -> saved result from magic alg
