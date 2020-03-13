# rmi_cve20173241

先运行Server,然后运行Client。

![](calc.png)

对了，代码忘记将serialVersionUID写死了，但是这个不存在问题，如果客户端与服务端的对象serialVersionUID不匹配，服务端是会报错的，而且错误会返回到客户端，其中就包括服务端对象的serialVersionUID，在利用时只要对应修改一下客户端构造的对象的serialVersionUID就行。^^

漏洞原理参考：https://www.freebuf.com/vuls/126499.html

顺带一提，本demo只是客户端向服务端发送恶意对象，但是，由于rmi是依靠序列化反序列化机制的，所以，客户端能够攻击服务端，那么服务端同样可以攻击客户端，但是在不知道客户端对象的serialVersionUID的情况下，客户端是不能够返回包含serialVersionUID的错误信息到服务端的，这是服务端攻击客户端的一点限制。如果这个serialVersionUID是公开的，那么服务端可以通过返回一个**远程方法返回类型的 恶意 子对象**的形式攻击客户端。


除此之外，结合codebase动态类加载机制，还可以多一种利用方式，只不过这种情况的限制挺大的...
