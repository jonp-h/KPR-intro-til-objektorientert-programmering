# Innkapsling - Account

Oppgaven er en innkapslet og litt utvidet variant av [Account-oppgaven](../oving1/Account.md), og stiller større krav til validering.

Et `Account`-objekt inneholder data om beløpet som står på kontoen og rentefoten (prosentpoeng).

Begge verdiene skal oppgis og settes når objektet opprettes og ingen av verdiene kan være negative.

`Account`-klassen har metoder for å sette inn og ta ut beløp, og legge til påløpte renter, i tillegg til en konstruktør for å initialisere en ny konto. Alle disse skal utløse unntak av typen `IllegalArgumentException`, dersom et argument ikke tilfredstiller kravene som angis.

- `Account(double, double)` - Konstruktøren skal ta inn startbeløpet og rentefoten (prosentpoeng). Ingen av disse kan være negative.
- `double getBalance()` - Returnerer beløpet som står på kontoen.
- `double getInterestRate()` - Returnerer renten på kontoen.
- `void setInterestRate(double)` - Denne metoden tar inn en ikke-negativ verdi og setter renten til denne verdien.
- `void deposit(double)` - Denne metoden tar inn et ikke-negativt beløp og øker konto-beløpet tilsvarende.
- `void withdraw(double)` - Denne metoden tar inn et ikke-negativt beløp og minsker konto-beløpet tilsvarende. Dersom det nye konto-beløpet er negativt, så skal tilstanden ikke endre, og det skal utløses et unntak av typen `IllegalArgumentException`.
- `void addInterest()` - beregner renta og legger det til konto-beløpet.

## Nyttig informasjon

- [Innkapsling](https://www.w3schools.com/java/java_encapsulation.asp)
- **Gyldig tilstand**: Tilstanden til et objekt er verdien av alle attributtene. En viktig del av oppførselen til et objekt er å sikre at tilstanden til objektet alltid er gyldig, dvs. at alle attributtene har gyldige/konsistente verdier. Dette kan vi for eksempel gjøre ved å opprette en ekstra metode som sikrer at dataen er godkjent. Feks:

  ```Java
  String name;

  void isValidName(String name) {
      // sjekker gyldigheten til navnet, returnerer true hvis gyldig, false hvis ikke
      // feks at strengen bare inneholder bokstaver
  }

  void setName(String name) {
      if (! isValidName(name)) {
          throw new IllegalArgumentException(... a suitable message ...);
      }
      this.name = name;
  }
  ```

## Java-kode

Implementer endringene fra [Account](../oving1/Account.md)-klassen i den nye `Account`-klassen med oppførsel som beskrevet over.

Testkode for denne oppgaven finner du i [oving2/AccountTest.java](../../src/test/java/oving2/AccountTest.java).
