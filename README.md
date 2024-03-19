#Aluno: 
Pedro Mota 

#Projeto POO 
Gerenciamento de Estoque

#Requisitos minimos e adicionais 
O projeto consta com todos os requisitos minimos solicitados na atividade, utilizei de funções da orientação a objetos como encapsulamento, extends, implements e polimorfismo. Achei útil a utilização do extends para criar diferentes tipos de produtos que extendessem de uma classe Produto principal.
Além disso também achei útil a implementação de uma interface para cálculo dos respectivos descontos dos produtos. O uso de polimorfismo foi útil para eu poder implementar uma ArrayList do tipo Produto e conseguir incluir nele as diferentes classes de produtos que criei, todas elas extendendo da classe mãe, Produto.
Também achei válido a utilização da classe ArrayList para que eu conseguisse gerenciar melhor o meu array. Além diso  utilizei também a classe estatica Comparator para conseguir ordenar a minha lista a partir da quantidade de determinado produto no estoque, assim causando uma organização no meu ArrayList.
Achei válida a implementação de métodos Override do toString nas minhas classes de produtos, para uma melhor impressão desses produtos.
O uso do encapsulamento foi feito e realizado pensando nas boas práticas e também visando a segurança dos dados e modularidade e organização do código. Fiz uso dos modificadores de acesso como protected e private e utilizei de getters e setters de acordo com o que desejei no código.
O uso de construtores também foi utilizado para melhor inicialização das instâncias dos objetos.
Foi feito uso também de um try catch para melhor especificação de exceptions.
Fiz uso também da classe `StringBuilder` para melhor manipulação das strings no meu array, já que precisava construir uma representação coesa e legível do estoque de produtos. Ao utilizar o `StringBuilder`, pude concatenar eficientemente as representações de string dos produtos, minimizando a sobrecarga de memória e melhorando o desempenho do código. Isso porque o `StringBuilder` aloca espaço suficiente para a string resultante antecipadamente, o que reduz a necessidade de realocações de memória conforme a string cresce, tornando a operação mais eficiente.
