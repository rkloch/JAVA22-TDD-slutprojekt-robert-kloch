
# Slutprojekt

Testningen av Item var den lättaste delen, då man bara testade de tre metoderna och såg till att format på id blev lower case. Använde en mock som ärvde från item så att jag kunde lägga tioll en getter för id, eftersom id är protected. Testade siffror, lowercase, uppercase, tom string och null.

Buffer var klurigare eftersom jag tyckte det var svårt att komma åt de synkroniserade metoderna ordentligt så att man kunde kolla att de throwade rätt exception. Nu löste jag det genom att ha en Thread i testet, men skulle nog haft det i mocken istället men visste inte riktigt hur jag skulle göra det smidigt.

Annars har jag testat att använda producer och consumer, och kollat så att det blir så många items i buffern som det ska vara och att queuen existerar. 




