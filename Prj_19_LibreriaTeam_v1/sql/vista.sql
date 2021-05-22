CREATE OR REPLACE VIEW libro_v AS SELECT l.titolo, e.nome AS Editore, CONCAT(a.cognome,' ',a.nome) AS Autore, ROUND(l.prezzo*1.22,2) AS Prezzo FROM libro l 
JOIN editore e ON l.editore_id = e.id 
JOIN autore_libro la ON l.id = la.libro_id 
JOIN autore a ON a.id = la.autore_id ORDER BY titolo WITH CHECK OPTION;