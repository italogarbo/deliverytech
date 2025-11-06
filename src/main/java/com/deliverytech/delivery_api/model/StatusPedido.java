package com.deliverytech.delivery_api.model;

public enum StatusPedido {

    CRIADO("Criado"), //O momento em que o pedido é criado, mas ainda não foi confirmado pelo restaurante.

    PENDENTE("Pendente"), //O pedido foi enviado ao restaurante e está aguardando confirmação.

    CONFIRMADO("Confirmado"), //O restaurante confirmou o pedido e está preparando a comida.

    PREPARANDO("Preparando"), //O restaurante está atualmente preparando o pedido.

    SAIU_PARA_ENTREGA("Saiu para entrega"), //O pedido foi preparado e saiu para entrega ao cliente.

    ENTREGUE("Entregue"), //O pedido foi entregue ao cliente com sucesso.

    CANCELADO("Cancelado"); //O pedido foi cancelado, seja pelo cliente ou pelo restaurante.

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }
}
