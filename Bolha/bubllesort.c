#include<stdio.h>
#include<stdlib.h>

int main() {
	int valores[10];
	int a = 0;
	int i = 0;
	int b = 0;

    for(i = 0; i < 10; i++) {
		valores[i] = 0;
	}

	for(i = 0; i < 10; i++) {
		valores[i] = (rand() % 10000);
		//valores[i] = i;
		//valores[i] = 9 - i; 
	}

	for(i = 0; i < 10; i++) {
		printf("%d ", valores[i]);
	}

	printf("\n");

	while(a < 10) {
		for(b = 0; b < 10; b++) {
			if(valores[b] > valores[b + 1]) {
				int temp = valores[b];
				valores[b] = valores[b + 1];
				valores[b + 1] = temp;
			}
		}
		a++;
	}

	for(i = 0; i < 10; i++) {
		printf("%d ", valores[i]);
	}
	printf("\n");

	return 0;
}
