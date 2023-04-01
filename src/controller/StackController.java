package controller;

import stack.StackInt;

public abstract class StackController {

	public static void execute() throws Exception {
		int[] vetor = { 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };

		StackInt pilha = new StackInt();
		
		for (int i : vetor) {
			if (i >= 0) {
				pilha.push(i);
			} else {
				int soma = pilha.pop() + pilha.pop();
				pilha.push(i);
				pilha.push(soma);
			}
		}
		
		while (!pilha.isEmpty()) {
			System.out.print(pilha.pop() + " ");
		}
		
	}

}
