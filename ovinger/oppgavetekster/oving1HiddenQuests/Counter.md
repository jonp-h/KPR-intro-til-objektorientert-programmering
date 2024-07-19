# Tilstand og oppførsel – Counter

I denne oppgaven skal du programmere en teller, som også skal håndtere tilfellet hvor slutt-verdien er lavere enn start-verdien ved å telle nedover.

## Java-kode

`Counter`-klassen skal altså ha de samme konstruktørene/metodene:

- `Counter(int start, int end)` - initialiserer objektet med angitte start- og slutt-verdier, hvor altså slutt kan være større eller mindre enn start, slik at telleren teller henholdsvis opp eller ned. Lik start og slutt-verdi skal utløse unntak av typen `IllegalArgumentException`. (Se hvordan man utløser unntak med throw [her](https://www.w3schools.com/java/java_try_catch.asp))
- `int getCounter()` - returnerer telleren
- `boolean count()` - beveger telleren i retning av slutt-verdien og returnerer true så lenge den ikke har nådd den, altså om telleren har mer igjen, og false ellers.

Testkode for oppgaven finner du her: [src/test/java/oving1HiddenQuests/CounterTest.java](../../src/test/java/oving1HiddenQuests/CounterTest.java)
