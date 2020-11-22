# ALOM (Architectures Logicielles Orientées Microservices)
## TP
Gestion-bank-SOAP-WSDL
## Description
L'objectif de ce TP est de découvrir et appliquer les bonnes pratiques de l'utilisation des WebServices XML/SOAP/WSDL.
Il s'agit de créer un webservice serveur dans le contexte de la banque. 
Ce webservice va notamment permettre de créer des clients, des comptes en banques sur le serveur, d'ajouter et retirer de l'argent, etc...
- Le front contient toutes les interfaces du serveur, qui lui permettent d'être appelé de différentes manières : Web pour ordinateur,
Web mobile, WebService pour des systèmes d'informations (d'autres serveurs) ou bien WebService pour des applications clientes 
(sur ordinateurs ou sur mobile). Il s'appuit sur le middle pour exécuter les traitements, et répond spécifiquement à l'appelant
en fonction de l'interface utilisée
- Le middle centralise le code métier, ainsi il peut être appelé par différente interface front pour exécuter le même traitement, 
modulo quelques adaptations effectuées dans la partie front 
