# Tilstand og oppførsel – Account

Oppgaven handler om en `Account`-klasse, som håndterer data i en bankkonto. Tilstanden i `Account`-objekter er som følger:

- `balance` - et desimaltall som angir beløpet som er på kontoen
- `interestRate` - et desimaltall som angir rentefot som prosentpoeng.

Begge verdiene skal være satt til `0.0` når klassen opprettes.

`Account`-klassen har fem metoder, med følgende oppførsel:

- `deposit(double)` - øker konto-beløpet med den angitte argument-verdien (et desimaltall), men kun dersom det er positivt. Dersom det er negativt skal ingen endring skje.
- `addInterest()` - beregner rente og legger det til konto-beløpet
- `getBalance()` - returnerer beløpet som er på kontoen
- `getInterestRate()` - returnerer rentefoten
- `setInterestRate(double)` - oppdaterer renten til å være den nye verdien (original verdi * rente / 100)

## Java-kode

Skriv Java-kode for `Account`-klassen med oppførsel som er beskrevet over.

Lag en passende `toString()`-metode og en `main`-metode, slik at du kan sjekke at oppførselen stemmer.

Testkode for denne oppgaven finner du her: [src/test/java/oving1/AccountTest.java](../../src/test/java/oving1/AccountTest.java).
