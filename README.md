# Padrao de Projeto - Facade

Sistema Home Theater Facade (Cinema em casa) 🎬

* Visão Geral

Este projeto implementa um sistema simplificado de Home Theater utilizando o padrão de projeto Facade. Ele permite controlar a TV, o sistema de som e a iluminação através de uma interface única.

#

* Funcionalidades 


✅ Controle unificado via Facade

✅ 3 modos pré-configurados:

Modo Cinema (luzes baixas + surround)

Modo Música (TV desligada + iluminação ambiente)

Modo TV (volume moderado + luzes padrão)


🔄 Ligar/desligar dispositivos individualmente
✅ Status integrado do sistema

#

* Como funciona?

O usuário interage apenas com o Facade através do menu

Cada opção do menu aciona uma operação complexa que coordena vários subsistemas

O código cliente (Main) não precisa conhecer os detalhes dos subsistemas

Toda a complexidade fica escondida atrás da interface simples do Facade