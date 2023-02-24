# repeticao-arrays
Exemplos de blocos de repetição e uso de arrays na linguagem Java.

#### For (next ++ / downto --)
```
int[] numeros = new int[20];
	
for (int i = 0; i < numeros.length; i++) {
	numeros[i] = random.nextInt(100);
}
```

#### For each

```
int[] numeros = new int[20];

for (int numero : numeros) {
	System.out.print(numero + " ");
}
```

#### For Multidimensional

```
int[][] M = new int[4][4];

for (int i = 0; i < M.length; i++) {
	for (int j = 0; j < M[i].length; j++) {
		M[i][j] = random.nextInt(9);
	}
}
```

#### Do { *[bloco]* } While ( *[condição]* )

```
int[] numeros = new int[20];
	
do {
	System.out.print(numero + " ");
} while (count < numeros.length);
```

#### While ( *[condição]* ) { *[bloco]* }

```
int[] numeros = new int[20];
	
while (count < numeros.length) {
	System.out.print(numero + " ");
} 
```