# Adapter

O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si. Em outras palavras converte a interface de uma classe em outra interface esperada pelos clientes, permitindo a comunicação entre classes que não poderiam trabalhar juntas devido a incompatibilidade de suas interfaces.

## Problema

Imagina que está criando uma conexão do Computador com a tela que tem a entrada HDMI como conexão. A applicação consegue conectar com Tvs que tem entrada HDMI, mas e quando for uma tela que tem entrada diferente como VGA por exemplo.

- Como uma classe pode ser reusada mesmo que não tenha a interface requisitada pelo cliente?
- Como classes de interfaces incompatíveis podem trabalhar juntas?

## Solução

Você pode criar um adaptador. Ele é um objeto especial que converte a interface de um objeto para que outro objeto possa entendê-lo.

Um adaptador encobre um dos objetos para esconder a complexidade da conversão acontecendo nos bastidores. O objeto encobrido nem fica ciente do adaptador.

Adaptadores podem não só converter dados em vários formatos, mas também podem ajudar objetos com diferentes interfaces a colaborar. Veja aqui como funciona:

O adaptador obtém uma interface, compatível com um dos objetos existentes.
Usando essa interface, o objeto existente pode chamar os métodos do adaptador com segurança.
Ao receber a chamada, o adaptador passa o pedido para o segundo objeto, mas em um formato e ordem que o segundo objeto espera.
