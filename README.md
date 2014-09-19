Använda git

Först:
1. Registrera dig på github
2. Om windows, ladda ner och installera git. Terminalen som ska användas blir någon git bash som installeras

Setup:
1. Börja med att skapa ett projekt i eclipse 'Computer'.
2. Öppna en terminal och navigera till computer katalogen med kommando 'cd'
3. När du är i ./Computer, kör kommando "git init" för initiera git för mappen.
4. Sen vill du lägga till det repo jag skapat i github till din lokala git repo. 
	Kör kommandot "git remote add origin https://github.com/jthure/Computer.git"
	konventionellt döper man remote till 'origin'
5. Därefter vill du hämta och sammanfoga vad som finns på origin med ditt lokala repo.
	kör kommandot "git pull origin master" =(hämta och sammanfoga från origin till master(din lokala basgren heter master))"
	Woila! Du har nu all den senaste datan från github på din dator!

För att propagera ändringar du gjort till github:
1. Kör kommandot "git add *" =(lägg till förändringar i alla filer)
2. Kör kommandot "git commit -m "skriv vad du gjort för ändringar här"" =(lås de ändringar du gjort på din dator)
3. Kör kommandot "git push" =(tryck ut din version till github. här behöver du förmodligen ange användarnamn och lösenord till github.)

Varje gång du ska arbeta med Computer, hämta senaste versionen från github först!:
1. Kör kommandot "git pull origin master" =(som innan)
