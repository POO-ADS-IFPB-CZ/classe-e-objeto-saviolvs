[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/4j22Em04)\
Questão 1:
<ul>
  <li>marca: Nome da marca da lâmpada (String)</li>
  <li>potencia: Potência da lâmpada em watts (int)</li>
  <li>tipo: Tipo da lâmpada (LED, fluorescente, incandescente) (String)</li>
  <li>preco: Preço da lâmpada (float)</li>
  <li>cor: Cor da luz emitida pela lâmpada (String)</li>
  <li>estoque: Quantidade disponível no estoque (int)</li>
</ul>
Questão 7: \
Nome da classe inválido, pois o nome da classe não pode conter espaços. O correto seria -> RegistroDeEleitor.\
Os atributos da classe estão públicos por padrão. O certo seria torná-los privados e usar getters e setters.\
Questão 8: \
O método maior está declarado como int, mas tenta retornar valores booleanos (true ou false) e o método menor está declarado como void, mas tenta retornar valores (num1 ou num2).\
Questão 14: \
O encapsulamento melhora a segurança e a modularidade do código, permitindo que os detalhes internos de uma classe sejam escondidos. Isso protege os dados contra acessos indevidos e facilita a manutenção, pois alterações nos métodos internos não afetam diretamente outras partes do código. Um exemplo seria uma classe Pessoa onde as informações String nome e int idade (ou qualquer outra informação que seja considerada confidencial) vão ser privadas pelo modificador "private" e podem ser acessador e controlador pelos métodos get e set.
