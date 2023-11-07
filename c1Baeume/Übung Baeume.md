# Übung Bäume

Welche Elemente gibt es in der Datenstruktur Baum?
Wurzelknoten,innere Knoten, Blätter, Kindknoten, Vaterknoten

Was ist das besondere an einem Binärbaum?
Ein Vaterknoten kann maximal 2 Kindknoten haben.

Welche Transversierungsmöglichkeiten von Bäumen kennen Sie?
- PreOrder  -> V-l-r
- PostOrder -> l-r-V
- InOrder   -> l-V-r

Beschreiben Sie einen Suchbaum:
- Ist ein Binärbaum mit festgelegten Regeln.
    - z.B. einzufügender Wert <= vater wird von links eingefügt.
    -->

Erstellen Sie einen Suchbaum für:
9, 10, 17, 5, 2, 1, 8

PreOrder    9,5,2,1,8,10,17
PostOrder   1,2,8,5,17,10,9
InOrder     1,2,5,8,9,10,17

Löschen von Knoten:
- Blattknoten und Elternknoten mit einem Kindknoten können direkt gelöscht werden.
- Bei Knoten, die zwei Kinder haben gilt:
    - im rechten Teilbaum den Knoten ganz links wählen
    - im linen Teilbaum den Knoten ganz rechts wählen