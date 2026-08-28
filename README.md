# Sistema de Banda Escolar

## NOME
Pedro Sante Maria Bueno Silva

## DESCRIÇÃO
Sistema para gerenciar instrumentos de uma banda escolar usando POO em Java.

# Sistema de Banda Escolar - Exercício POO

---

## PARTE 2: PERGUNTAS DE EXTRAÇÃO

### 1. Quantas classes concretas (instrumentos) o texto descreve? Quais são?
R: 2 classes concretas: Violao e Bateria

### 2. Quais atributos aparecem em TODOS os instrumentos? Esses vão para a classe abstrata.
R: 
  - nome (String)
  - material (String)
  - afinado (boolean)

### 3. Qual atributo é exclusivo de cada instrumento (aparece só no parágrafo dele)?
R:
  - Violao: quantidadeCordas (int) - 6 cordas
  - Bateria: quantidadeTambores (int) - 5 tambores

### 4. O texto descreve um comportamento que cada instrumento faz de um jeito DIFERENTE (vira método abstrato) e um comportamento que é IGUAL para todos (vira método normal na classe mãe). Quais são?
R:
  - **Diferente (método abstrato):** tocar() - cada instrumento produz um som característico
  - **Igual (método concreto):** afinar() - o processo de afinação é o mesmo para todos

### 5. Um trecho diz que "não deve ser possível criar um instrumento genérico". Qual recurso do Java garante isso?
R: Classe abstrata (abstract class). Quando uma classe é declarada como abstract, ela não pode ser instanciada diretamente com o operador new.

### 6. Para percorrer todos os instrumentos no mesmo laço, sem instanceof e sem cast, que tipo a List<?> do teste deve ter?
R: `List<InstrumentoMusical>` - usando o tipo da classe abstrata como referência polimórfica.
