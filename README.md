# Adapter

O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si. Em outras palavras converte a interface de uma classe em outra interface esperada pelos clientes, permitindo a comunicação entre classes que não poderiam trabalhar juntas devido a incompatibilidade de suas interfaces.

## Problema

Imagina que está criando uma conexão do Computador com a tela que tem a entrada HDMI como conexão. A applicação consegue conectar com Tvs que tem entrada HDMI, mas e quando for uma tela que tem entrada diferente como VGA por exemplo.

- Como uma classe pode ser reusada mesmo que não tenha a interface requisitada pelo cliente?
- Como classes de interfaces incompatíveis podem trabalhar juntas?
