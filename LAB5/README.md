1 - Partie Grades

Execution de grades pour la premiere fois:

mix phx.server

![Screenshot 2023-07-06 at 22-51-26 Grades](https://github.com/Talb057/seg3503_playgrund/assets/71707486/b6018c21-dddf-4530-ad30-54dcfa8ac68b)

EN appuyant sur le *Calculate*, il ne fonctionne pas et on recoit les erreurs suivantes:

![Screenshot from 2023-07-08 20-04-16](https://github.com/Talb057/seg3503_playgrund/assets/71707486/52e2c0a7-2f6a-4b5f-98f2-b924fe6004f8)

Donc voici le Stub de Grades.Calculator:

![Screenshot from 2023-07-09 18-02-39](https://github.com/Talb057/seg3503_playgrund/assets/71707486/e05cf9b2-c37d-451b-9f71-673d64687af2)

Maintenant le bouton fonctionne:

![Screenshot 2023-07-09 at 18-04-00 Grades](https://github.com/Talb057/seg3503_playgrund/assets/71707486/aa8dd4c0-093e-4487-812a-c3c07b9ee99d)

![Screenshot 2023-07-09 at 18-04-13 Grades](https://github.com/Talb057/seg3503_playgrund/assets/71707486/f5371bd0-88c4-442e-8249-acc22be9fcaa)


2 - Partie Twitter:

Voici l'implementation des tests dans le diossier  twitter:

![code](https://github.com/Talb057/seg3503_playgrund/assets/71707486/cab90d2f-7264-4e04-aec7-eec1d51a6e71)

Lors de l'execution on 2 Failures:

![Screenshot from 2023-07-09 18-09-48](https://github.com/Talb057/seg3503_playgrund/assets/71707486/813bade3-d01a-4b75-aada-3513d9b12569)

Le probleme se trouve dans la methode *isMentionned* dans Twitter.java

En la changeant comme ca:

![Screenshot from 2023-07-09 18-18-47](https://github.com/Talb057/seg3503_playgrund/assets/71707486/f7ccce90-8a38-4351-8e10-d77b299e0bcd)

Le probleme est a lors regle et tous les tests fonctionnent:

![Screenshot from 2023-07-09 18-20-50](https://github.com/Talb057/seg3503_playgrund/assets/71707486/62a8feca-61ab-4ba6-997d-b133f4928ff8)





