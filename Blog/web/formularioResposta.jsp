<%-- 
    Document   : formularioComentario
    Created on : 20/09/2018, 18:17:04
    Author     : mathe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <c:choose>
    <c:when test="${empty sessionScope.nomeUsuario}">
        <h4>É preciso fazer login para comentar!</h4>
        <div class="botaoPadrao alinharEsquerda" style="padding: 15px 0;">
            <a href="../login">Entrar</a>
        </div>
    </c:when>
    <c:otherwise>    
    <input type="hidden" id="tipoComentario" value="R" name="tipoComentario" />
        <input type="hidden" id="comentarioPai" value="0" name="comentarioPai" />
        <div class="comentarioContainer">
            <div>
                <c:choose>
                    <c:when test="${empty sessionScope.fotoUsuario}">
                        <img class="fotoPerfilComentarista" src="../graficos/semfoto.png">
                    </c:when>
                    <c:otherwise>
                        <img class="fotoPerfilComentarista" src="../${sessionScope.fotoUsuario}">
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="caixaDeTexto alturaAjustavel">
                <textarea id="comentarioResposta" name="comentario" maxlength="600"></textarea>
                <label for="comentario">Adicione uma resposta pública...</label>
                <div></div>
            </div>
        </div>
        <div class="validacaoCaptcha">
            <div>
                <img id="captchaResposta" src="../gerador-captcha">
            </div>
            <div class="campoDeTexto">
                <input id="captcha" type="text" name="captcha" maxlength="6" autocomplete="off"/>
                <label for="captcha">Código</label>
                <div></div>
            </div>
            <div class="botaoPadrao alinharDireita" style="padding: 15px 0;">
                <input value="Responder" disabled class="submeterResposta" style="margin-left:10px;" type="submit"/>
                <a href="javascript:void(0)" class="cancelarResposta">Cancelar</a>
            </div>
        </div>
        </c:otherwise>
</c:choose>
