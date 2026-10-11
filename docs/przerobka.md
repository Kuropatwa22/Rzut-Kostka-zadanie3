 Przeróbka obsługi przycisków

 Co się zmieniło?

W poprzedniej wersji aplikacji używałem lambdy i android:onClick do obsługi przycisków.

W nowej wersji użyłem `implements View.OnClickListener`.

Wszystkie trzy przyciski są teraz obsługiwane przez jedną metodę `onClick()`.

## Która wersja jest krótsza?

Wersja z lambdą jest krótsza, bo nie trzeba pisać `implements View.OnClickListener` i dodatkowej metody `onClick()`.

## Którą wersję łatwiej rozbudować?

Moim zdaniem wersję z `implements View.OnClickListener`, ponieważ wszystkie przyciski są obsługiwane w jednym miejscu.

Gdybym chciał dodać kolejne pięć przycisków, wystarczyłoby podłączyć je przez `setOnClickListener(this)` i dopisać kolejne warunki w `onClick()`.

## Czy aplikacja działa tak samo?

Tak. Nadal można losować liczbę od 1 do 6, liczyć rzuty, czyścić wynik i resetować aplikację.

Przy próbie wyczyszczenia wyniku przed pierwszym rzutem pojawia się Toast.
