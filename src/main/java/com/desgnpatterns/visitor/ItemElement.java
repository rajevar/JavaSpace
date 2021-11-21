package com.desgnpatterns.visitor;

interface ItemElement
{
    public int accept(ShoppingCartVisitor visitor);
}

