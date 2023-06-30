
Exercice 1:

![Localhost ss](https://github.com/Talb057/seg3503_playgrund/assets/71707486/652155ee-2e70-4e97-b638-6d75de0fcead)



Cas de Test | Resultats Escomptes | Resultats actuels | Verdict(Succes, Echec, Non-concluant) 
--- | --- | --- | --- 
1 | Acceptee | Acceptee| Succes 
2 | Acceptee | Acceptee | Succes 
3 | Acceptee | Acceptee | Succes
4 | Acceptee | Acceptee | Succes
5 | Err1 | Err1 et Err3 | Echec 
6 | Err3 | Err1 et Err3 | Echec
7 | Err3 | Err3 | Succes
8 | Err1 | Err1 | Succes


Test 1:

![test1b](https://github.com/Talb057/seg3503_playgrund/assets/71707486/a8618949-902c-4d1d-a2ca-da0ddea44d32)
![test1e](https://github.com/Talb057/seg3503_playgrund/assets/71707486/ff7f0b9f-c46a-4164-8fed-94ca7fafc44c)

Test 2:

![test2b](https://github.com/Talb057/seg3503_playgrund/assets/71707486/8296c360-baa7-4d2f-970f-d84542c1ac49)

![test2e](https://github.com/Talb057/seg3503_playgrund/assets/71707486/8460ddd1-0f6a-4704-bfd1-8475e58252dd)

Test 3:

![test3b](https://github.com/Talb057/seg3503_playgrund/assets/71707486/02c2f648-3abf-44cf-9d8d-ea9cfbdafea4)

![test3e](https://github.com/Talb057/seg3503_playgrund/assets/71707486/d7399c52-052d-4462-b0b5-f1bba227c42d)

Test 4:

![test4b](https://github.com/Talb057/seg3503_playgrund/assets/71707486/2e51e3b7-571f-485b-906f-497e5d380cc8)

![test4e](https://github.com/Talb057/seg3503_playgrund/assets/71707486/19abe0c0-8e21-4d7f-9c7a-63d8bc01b293)

Test 5:

![test5](https://github.com/Talb057/seg3503_playgrund/assets/71707486/801f7393-9269-4cd0-991f-322020b37a2c)

Test 6:

![test6](https://github.com/Talb057/seg3503_playgrund/assets/71707486/e2712245-8f9e-4e75-a312-3848284131ac)

Test 7:

![test 7](https://github.com/Talb057/seg3503_playgrund/assets/71707486/74e23769-1962-45a1-9d9d-d44cd850045c)

Test 8:

![test8](https://github.com/Talb057/seg3503_playgrund/assets/71707486/b161b7a1-7ebf-4e25-bad7-a25bc282e89b)

Exercice 2:
```bash
neyzak@NeyzakPc:~/8-Summer 2023/SEG 3503/seg3503_playgrund/LAB 2/ecs/ecs$ bin/test

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  ├─ DateTest ✔
│  │  └─ nextDate_sample() ✔
│  └─ BitTest ✔
│     ├─ constructor_int_ok() ✔
│     ├─ constructor_int_tooLarge() ✔
│     ├─ constructor_int_tooSmall() ✔
│     ├─ constructor_Bit() ✔
│     ├─ hashCode_values() ✔
│     ├─ getIntValue() ✔
│     ├─ equals() ✔
│     ├─ toString_values() ✔
│     ├─ or() ✔
│     ├─ and() ✔
│     ├─ not() ✔
│     ├─ xor() ✔
│     ├─ setValue() ✔
│     └─ constructor_default_0() ✔
└─ JUnit Vintage ✔
   ├─ BitAndTest ✔
   │  ├─ [0] ✔
   │  │  └─ testAnd[0] ✔
   │  ├─ [1] ✔
   │  │  └─ testAnd[1] ✔
   │  ├─ [2] ✔
   │  │  └─ testAnd[2] ✔
   │  └─ [3] ✔
   │     └─ testAnd[3] ✔
   ├─ DateNextDateOkTest ✔
   │  └─ initializationError ✘ day must less or equal to 31.
   └─ DateNextDateExceptionTest ✔
      ├─ [0] ✔
      │  └─ testNextDateCorrect[0] ✘ Expected java.lang.IllegalArgumentException to be thrown, but nothing was thrown.
      ├─ [1] ✔
      │  └─ testNextDateCorrect[1] ✔
      ├─ [2] ✔
      │  └─ testNextDateCorrect[2] ✘ Expected java.lang.IllegalArgumentException to be thrown, but nothing was thrown.
      ├─ [3] ✔
      │  └─ testNextDateCorrect[3] ✘ Expected java.lang.IllegalArgumentException to be thrown, but nothing was thrown.
      ├─ [4] ✔
      │  └─ testNextDateCorrect[4] ✘ Expected java.lang.IllegalArgumentException to be thrown, but nothing was thrown.
      ├─ [5] ✔
      │  └─ testNextDateCorrect[5] ✔
      ├─ [6] ✔
      │  └─ testNextDateCorrect[6] ✔
      ├─ [7] ✔
      │  └─ testNextDateCorrect[7] ✔
      └─ [8] ✔
         └─ testNextDateCorrect[8] ✔

Test run finished after 187 ms
[        20 containers found      ]
[         0 containers skipped    ]
[        20 containers started    ]
[         0 containers aborted    ]
[        20 containers successful ]
[         0 containers failed     ]
[        29 tests found           ]
[         0 tests skipped         ]
[        29 tests started         ]
[         0 tests aborted         ]
[        24 tests successful      ]
[         5 tests failed          ]

