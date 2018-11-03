import java.io.IOException;

class HTMLPrinter {

    FileReader writer = new FileReader("output.HTML", false);
    String fileContents;

    HTMLPrinter(Store store) {

        fileContents = 
        "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"><title>" 
        + store.storeName 
        + "</title><link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\"><style>body {font-family: 'Montserrat', sans-serif; margin: 0px;} div {padding: 20px 40px 20px 40px;} h6 {margin-bottom: 0px; } h1 { margin: 5px 0px 5px 0px; }  h5 { margin: 0px; } a { color: inherit; text-decoration: none; } .flex { display: flex; flex-wrap: wrap; margin: 0px; padding: 0px; justify-content: center; align-content: stretch; } .flex div { width: 250px; max-width: 80%; margin: 20px 10px 10px 10px; flex-grow: 1; }  .black .flex a { display: block; flex-grow: 1; padding: 0px 20px 0px 20px; text-align: center;  border: 1px #F0F0DF solid; border-radius: 20px; background-color: rgba(240, 240, 223, 0.2); margin: 0px 10px 20px 10px;} .black a h3 { padding: 0px; margin: 0px;} .flex-card { background-color: rgba(240, 240, 223, 0.4);} .flex img { display: block; margin-left: auto; margin-right: auto; width: 80%;} .card {                  width: 95%; background-color: rgba(240, 240, 223, 0.4); padding: 2.5%; margin: 2.5% 0 2.5% 0; }                .ul { border-bottom: 3px solid;} .black { background: linear-gradient(#3F5866, #2B3A42); color: #F0F0DF; } .white { background-color: #BDD3DE; color: #2B3A42;} .black b, .black em {              color: #BDD3DE;                   transition: color 1s;                } .black b:hover,                .black em:hover {                    color: #F0F0DF;                } .bot300 {                    margin-bottom: 300px;                } .bot200 {                    margin-bottom: 200px;                } .bot100 {                    margin-bottom: 100px;                } .black .outline {                    border: 3px #F0F0DF solid;                    border-radius: 20px;                    background-color: rgba(240, 240, 223, 0.2);                }</style>                </head>               <body>                   <!-- Title Block -->                 <div class=\"black\">                       <div class=\"outline bot100\"><h1>" 
        + store.storeName 
        + "</h1><h5>" 
        + store.slogan 
        + "</h5></div><div class=\"flex\">";

        for(int i = 0; i < store.linkList.size(); i++) {
            fileContents += "<a href=\""
                + store.linkList.get(i).url
                + "\"><h3>"
                + store.linkList.get(i).title
                + "</h3></a>";
        }

        fileContents += "</div></div><!-- Content Block --><div class=\"white\"><p class=\"bot100\"></p><h1><span class=\"ul\">"
            //Product Type Here
            + "Products and Services:"
            + "</span></h1><div class=\"flex\">";

        for(int i = 0; i < store.itemList.size(); i++) {
            fileContents += "<div class=\"flex-card\"><img src=\""
                + store.itemList.get(i).ImageURL
                + "\" alt=\"\"><h3>"
                + store.itemList.get(i).name
                + "</h3><p>"
                + store.itemList.get(i).Description
                + "<h5 id=\"price" + i + "\">" + store.itemList.get(i).price + "</h5>"
                + "</p><button id=\"price" + i + "\">Purchase</button></div>";
        }

        fileContents += "</div></div><script>for(let i = 0; i < " 
                + store.itemList.size() 
                + "; i++) document.getElementById(\"price\" + i).addEventListener(\"click\", () => { console.log(\"Price: \" + document.getElementById(\"price\" + i).innerHTML);  let CC = prompt(\"Please enter your credit card number: \", \"\"); }); </script></body></html>";
    }

    void print() throws IOException {
        writer.write(fileContents);
    }
}