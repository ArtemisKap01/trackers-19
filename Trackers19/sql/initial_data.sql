-- School Classes
INSERT INTO 'SchoolClasses' (Id, Name) VALUES (1, 'Α');
INSERT INTO 'SchoolClasses' (Id, Name) VALUES (2, 'Β');
INSERT INTO 'SchoolClasses' (Id, Name) VALUES (3, 'Γ');
INSERT INTO 'SchoolClasses' (Id, Name) VALUES (4, 'Δ');
INSERT INTO 'SchoolClasses' (Id, Name) VALUES (5, 'Ε');
INSERT INTO 'SchoolClasses' (Id, Name) VALUES (6, 'ΣΤ');
select * from SchoolClasses;


-- Teachers
INSERT INTO 'Teachers' 	('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address','AFM') VALUES 
						(1,"DFord","08775CB1-BC10-E88D-CBBF-479FD042EA91","Damian","Ford",7421583307,"non.egestas@atortorNunc.co.uk","Ap #220-1764 Nam Street","1212/0505/2020202020202020",1,"564 Est, Rd.",317667950),
						(2,"KGutierrez","8567A28D-18DB-5D99-B5E7-0E316ACAAE62","Kaseem","Gutierrez",7855801568,"nec.eleifend@metusAliquamerat.ca","7660 Faucibus. Ave","2727/0707/2020202020202020",2,"3833 Facilisis Rd.",841822458),
						(3,"CSnider","8069C0E8-9C53-9C6C-0A12-F7847066A7FE","Caesar","Snider",7560594039,"in.hendrerit@egestas.org","505-9714 Fames St.","0808/0808/2009200920092009",3,"Ap #261-8874 Lobortis. Avenue",503845908),
						(4,"JLove","1C5A3995-6F8C-911F-CE22-DD4BDFEF2326","Jason","Love",2967758518,"orci.Ut@utipsum.com","P.O. Box 607, 9280 Venenatis Street","3030/0606/2018201820182018",4,"902-1029 Vitae Road",344962451),
						(5,"SClarke","C2947B98-78F7-2401-6EDF-474D5302BF59","Simon","Clarke",9507440962,"Proin.ultrices@sed.co.uk","Ap #537-7422 Eu Av.","1313/0505/2021202120212021",5,"3972 At, Road",208031418),
						(6,"NWolfe","4E5F3D19-599F-E9C8-96C6-4D4F05805EA0","Noble","Wolfe",4156345112,"morbi.tristique.senectus@lacusMauris.net","Ap #100-786 Nam Road","1212/1010/2020202020202020",6,"Ap #395-6411 Pharetra Street",429281025);
SELECT * FROM Teachers;


-- Students

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(1,"FFrank","D939EEE0-EAD7-9491-382B-A733598C58F2","Fredericka","Frank",7103622917,"nunc.In.at@magnaSuspendisse.net","P.O. Box 729, 7618 Ipsum Av.","0707/0303/2010201020102010",4,"Ap #634-400 Lobortis Road"),
						(2,"NYates","48412F45-1B7B-A693-B657-C30B2FF6EFA4","Nissim","Yates",8160415429,"Morbi.vehicula.Pellentesque@etnuncQuisque.net","647-4057 Eleifend Road","2828/0505/2011201120112011",3,"402-843 Dolor Rd."),
						(3,"TFlynn","3D551E02-401D-91EA-FC4C-656D4A66D25D","Taylor","Flynn",9975060822,"Etiam@blanditat.org","549 Id, St.","0808/0505/2008200820082008",2,"Ap #580-6097 At St."),
						(4,"UKim","37AA462F-B10A-2E5B-1624-B14E73CDE017","Upton","Kim",9813022788,"rutrum.Fusce@Aliquamultrices.edu","P.O. Box 261, 1834 Maecenas Ave","3131/0707/2019201920192019",3,"P.O. Box 277, 759 In, Rd."),
						(5,"HLove","AD0E4F2C-C328-B6FF-8BEA-67BC6BF73921","Hiroko","Love",4826329440,"purus.Duis@aliquam.edu","Ap #397-3448 Accumsan Rd.","1818/1212/2019201920192019",1,"253-2077 Aliquet Rd."),
						(6,"SMcclure","FCDBE713-07A4-CEB3-74FF-A5DF48E9B0AE","Stacey","Mcclure",4476642552,"leo@estvitae.co.uk","680-4196 Magna Street","2727/0101/2017201720172017",5,"204 In, Road"),
						(7,"KGuerrero","23F054FD-6BB7-208D-1C82-39E2DEB29E03","Katelyn","Guerrero",9873766028,"tincidunt.tempus@velturpis.net","804-5450 In Street","1616/0101/2020202020202020",4,"Ap #382-5178 Ac Rd."),
						(8,"LJenkins","A3E1F706-C7A6-E14C-4D3D-3403BA97C128","Linus","Jenkins",6381298719,"pharetra.felis@elementumsemvitae.ca","P.O. Box 602, 1133 A, Avenue","0505/0202/2016201620162016",1,"Ap #439-6994 Mauris Rd."),
						(9,"SKnowles","5687399A-5475-A987-B1F9-4C59DBC5B610","Shaine","Knowles",7744993319,"dolor.dapibus.gravida@sollicitudin.ca","6839 Nam Ave","2727/1212/2019201920192019",1,"824-3885 Pede. St."),
						(10,"KGlass","3D7218A6-082D-516F-ADFF-BC6AB7D26606","Kaye","Glass",2449609644,"at.augue@mattisvelit.net","Ap #543-5613 Nulla Ave","0505/1010/2015201520152015",1,"1615 Sem Ave");
						
INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(11,"SMay","97D0BF0C-3EEB-8E01-0EA4-8796172C6C99","Suki","May",8202100221,"parturient@luctusipsumleo.org","924-5543 Eu Street","0808/1212/2018201820182018",1,"Ap #606-6599 Pellentesque St."),
						(12,"SBernard","5490FCA1-0AB3-BDBF-EA70-623B3E114EB2","Signe","Bernard",4924356193,"Suspendisse@congue.edu","P.O. Box 245, 2751 Molestie Rd.","2525/0808/2018201820182018",3,"Ap #394-3131 Semper St."),
						(13,"RTownsend","678F91F7-9AD4-B5E3-C99D-8F5488DAC7D1","Reuben","Townsend",2088236284,"neque.sed.sem@inceptoshymenaeos.net","P.O. Box 384, 5201 In Avenue","0909/1212/2014201420142014",4,"P.O. Box 560, 5279 Phasellus St."),
						(14,"DHayden","82D11351-7D07-94D7-FC82-DAD354D82A7F","Daphne","Hayden",6357113189,"nec@rhoncusProinnisl.co.uk","P.O. Box 476, 4327 Lacus, Av.","2929/0606/2007200720072007",1,"Ap #343-1137 Imperdiet Ave"),
						(15,"DBush","6B8DDC75-B074-51E7-9D6C-9F018CE5AA79","Davis","Bush",9393990476,"molestie.tellus@diam.com","5033 Tellus, Street","3030/1212/2017201720172017",2,"P.O. Box 854, 1378 Aliquam Avenue"),
						(16,"AHayden","47A5DF7B-7ECF-06DA-BA92-4BE2FFAFECFE","Anne","Hayden",4460230629,"gravida@Quisquefringilla.co.uk","P.O. Box 723, 6178 Vel Rd.","0707/0303/2019201920192019",5,"975-5346 Lectus Road"),
						(17,"NDudley","193E266C-BD27-A1FF-E328-FCFE30AD19CC","Nissim","Dudley",2001894267,"auctor@sociosquadlitora.net","433-7832 Integer St.","1414/0909/2010201020102010",4,"959-7452 Natoque Ave"),
						(18,"LSandoval","AF81AC9D-8181-03BE-5C38-2811581DC611","Lawrence","Sandoval",4487948497,"neque.pellentesque.massa@placeratorci.org","5370 Arcu Avenue","2121/1010/2007200720072007",3,"P.O. Box 592, 3593 In Ave"),
						(19,"RBowen","CF79FF18-A269-34E5-9842-A4F6F9A8D6D5","Reed","Bowen",4029955160,"libero@eudui.edu","202-7633 Velit Rd.","2626/1212/2012201220122012",5,"996 Sit St."),
						(20,"RHawkins","2A7ADF86-7560-4483-15E4-825128029B5E","Ross","Hawkins",6506791154,"vestibulum.nec@Pellentesquetincidunt.org","Ap #734-2782 Convallis Ave","2020/0505/2012201220122012",6,"543-7029 Duis Street");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(21,"BVasquez","34D58821-4F56-D1CC-CA0D-21960E4B2B99","Brandon","Vasquez",8585456928,"vel.arcu.Curabitur@nisiCum.edu","Ap #554-7473 In Rd.","2828/0303/2020202020202020",3,"758-6958 Luctus St."),
						(22,"LCarson","2EDEFE38-229B-D583-2048-C3D154E25B9B","Lev","Carson",4590147235,"volutpat.ornare@magnaa.ca","Ap #257-8200 Cras Road","2727/0606/2010201020102010",5,"P.O. Box 248, 1761 Malesuada Avenue"),
						(23,"CJoseph","08BCA546-744C-C78C-3339-EB96890A8C2A","Chloe","Joseph",4111393673,"nonummy.ultricies@arcu.edu","3571 At Avenue","2828/0404/2014201420142014",4,"9842 Faucibus Road"),
						(24,"IPuckett","8CC31BD6-47EE-E0E7-7AB9-9C977247762B","Isaac","Puckett",4225757001,"luctus.lobortis.Class@elitfermentum.net","589-3067 Integer St.","0707/1010/2020202020202020",4,"611-8649 Pede Street"),
						(25,"HGallagher","C95AA855-C985-11B6-7318-F418B965D1CB","Harper","Gallagher",6037614307,"Nullam@aliquamiaculislacus.com","P.O. Box 590, 2427 Nunc. St.","3131/0101/2011201120112011",3,"598-4050 Ac Av."),
						(26,"LPhillips","A978B6F0-1D7C-C35A-CA6B-98069684376E","Lunea","Phillips",2186744164,"gravida.Praesent.eu@nequepellentesquemassa.co.uk","106 Mauris St.","2828/0303/2007200720072007",4,"639-2450 In Road"),
						(27,"USears","A5EA844C-59C2-35B0-A57D-79ACAFF3118A","Ulla","Sears",2404439053,"dui.augue@euneque.org","9328 Tincidunt St.","0909/0606/2014201420142014",3,"Ap #404-3901 Lorem Road"),
						(28,"LFrederick","5F2FBCF6-D12F-540D-DC9D-323CB5096C45","Lawrence","Frederick",5697789808,"ante.Vivamus.non@ullamcorpervelit.org","Ap #167-7847 Vulputate St.","0606/1212/2020202020202020",6,"Ap #463-3684 Sit Rd."),
						(29,"KGallagher","FA00C5A6-A4E1-89A6-A818-B4C8FA39DDCE","Kaseem","Gallagher",6402643962,"molestie.in@velitQuisque.org","P.O. Box 783, 9894 Augue St.","2222/0404/2014201420142014",6,"P.O. Box 357, 2448 Semper Av."),
						(30,"BFitzgerald","2F262C7E-33FD-A009-F42F-F3D8A191FC8F","Brooke","Fitzgerald",6839278967,"ornare.facilisis@aliquetmagnaa.edu","2082 Et Ave","3131/0303/2015201520152015",4,"919-7393 Pellentesque Av.");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(31,"AMullins","2B99A377-50B4-CB9E-C435-EEE6E1CC882B","Astra","Mullins",7882688912,"tellus.Suspendisse@facilisisfacilisis.com","Ap #991-790 Nulla Street","0404/0606/2021202120212021",5,"5391 Mi St."),
						(32,"JRandall","FBC6C004-3B34-FFFF-5BFE-F4167CB69875","Jena","Randall",3434838513,"tellus@semper.co.uk","P.O. Box 155, 3301 In St.","2121/0101/2017201720172017",6,"P.O. Box 599, 3438 Libero. St."),
						(33,"OHurst","90A9EB77-40D9-82AE-89B9-3538117B054E","Odysseus","Hurst",2242847616,"ultrices@euaugue.edu","3701 Fermentum Ave","2626/1111/2007200720072007",1,"1312 Hendrerit Ave"),
						(34,"BRiddle","9EAB44C5-BDA0-F56E-FEA2-0158BAC75DDA","Barbara","Riddle",3049766528,"elit.Aliquam.auctor@nibh.org","P.O. Box 411, 5343 Rutrum, Road","1414/0101/2019201920192019",6,"P.O. Box 869, 3892 Cursus. St."),
						(35,"BDoyle","F4FCDF5D-FA09-280B-F87E-85C57C01837E","Blair","Doyle",4254966178,"nulla.Donec.non@mattis.co.uk","639-915 Euismod Road","2121/0909/2021202120212021",2,"P.O. Box 551, 7615 Iaculis Ave"),
						(36,"KMoses","89C46007-0F0F-0B00-0BF8-3BAD94E2F1F0","Kirby","Moses",4620870479,"Pellentesque.tincidunt.tempus@indolorFusce.ca","Ap #641-4522 Morbi Rd.","1010/0303/2009200920092009",2,"654-7187 Congue. Av."),
						(37,"IGuerrero","4C29908E-5A43-C70C-3F8D-CDD417EAFF7B","Ivor","Guerrero",6054908426,"feugiat.placerat.velit@ipsumprimisin.ca","Ap #568-4795 Proin Av.","0707/1212/2006200620062006",6,"240-6440 Erat Ave"),
						(38,"GMccoy","4CA8E772-26FC-0A0B-C3CB-416B94F401FB","Gareth","Mccoy",5740048780,"aliquam@dictumeueleifend.edu","2805 Magna. Rd.","1515/0707/2021202120212021",2,"Ap #543-7693 Orci St."),
						(39,"SJohnston","869677B3-A6D2-BE2D-D69F-26AAA053A647","Sebastian","Johnston",9878522365,"euismod@vulputate.ca","Ap #416-6419 Euismod Rd.","1616/0909/2018201820182018",1,"1260 Ultrices Ave"),
						(40,"KPotts","0BC1DF78-DF77-1A82-1B00-2D36E2FEFD3D","Kenyon","Potts",6818997233,"mauris@vulputatelacusCras.com","166-7394 Aliquet Ave","2424/0808/2019201920192019",4,"P.O. Box 699, 9753 Ipsum Av.");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(41,"BMckee","560004E1-ABA2-3F58-9D9C-C8E6E4464935","Bert","Mckee",2936935549,"purus.Nullam.scelerisque@loremtristiquealiquet.org","P.O. Box 588, 9933 Cras Rd.","2626/0909/2018201820182018",3,"276-9866 Eget Avenue"),
						(42,"XHampton","E59FD417-C325-246C-5E61-D6B94C26E47F","Xantha","Hampton",6520404797,"turpis@elitpede.org","512-9326 Pellentesque Av.","1919/0808/2019201920192019",2,"P.O. Box 724, 2535 Natoque Avenue"),
						(43,"MSnyder","7C987B81-C79A-3A05-8D08-ACAA949DFA69","Morgan","Snyder",9079698661,"ipsum.nunc.id@nisl.ca","Ap #151-7739 Vitae Rd.","1414/1212/2015201520152015",5,"7799 Vitae Rd."),
						(44,"OWoodard","E58805F2-BB74-27FD-EB58-E8CF46651939","Olympia","Woodard",9187805496,"nisi.nibh@litoratorquentper.ca","P.O. Box 498, 5114 Interdum Road","2121/0909/2008200820082008",2,"Ap #872-4617 Nec, Ave"),
						(45,"RGreen","DD49FA67-C45A-145D-CD6A-34C8A6FDFB93","Renee","Green",8289571661,"dolor.Fusce@Donecnibhenim.edu","Ap #202-5039 Non, Ave","0909/0404/2007200720072007",1,"840-7702 Sem St."),
						(46,"LJoseph","6F26DAA5-2B3B-8BE1-2EAF-928DA8F70C20","Linda","Joseph",5208157537,"massa.non@pretiumnequeMorbi.ca","1560 Tincidunt Rd.","2525/0404/2016201620162016",5,"6954 Praesent Rd."),
						(47,"IDonaldson","4D0591E3-1717-055C-0A7C-187C423C9AE5","Isaiah","Donaldson",3982924555,"ac@semperNam.co.uk","931-8618 Sagittis Avenue","3131/0707/2008200820082008",1,"353-4140 Dictum Rd."),
						(48,"TWiggins","AEBF3B20-E775-B19E-5B86-AE7C4B49839D","Thane","Wiggins",9465834897,"ornare.In.faucibus@egettincidunt.org","1064 Quam. Street","2020/0303/2014201420142014",4,"530-8124 A St."),
						(49,"DGrimes","FF524200-BE81-B846-4F94-3A3A739F4173","Dane","Grimes",8919418873,"malesuada.vel@Uttincidunt.edu","Ap #828-1037 Arcu. Rd.","1717/0101/2012201220122012",4,"863-8528 Proin Rd."),
						(50,"LNoel","C0ECE52D-B5E1-2975-6F86-0AAAF97D2D0B","Libby","Noel",5997116203,"Pellentesque.ultricies@nonsollicitudin.ca","484-8816 Ligula St.","2828/0404/2016201620162016",3,"366-9611 Ligula. Street");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(51,"CWilkerson","F49E9867-4CF4-B3DB-CCF8-F2889901663A","Cassandra","Wilkerson",2979262303,"ipsum@leoCras.co.uk","967-6151 Dui, Street","0202/0303/2008200820082008",5,"P.O. Box 677, 3727 Fringilla Av."),
						(52,"MBuchanan","E41CD884-C2E4-3641-36EF-EF7D044E0D1F","Meghan","Buchanan",8263793546,"molestie@arcuVestibulum.org","9563 Vel, Rd.","1818/0404/2014201420142014",3,"2955 Risus. Street"),
						(53,"TBrady","53303503-80A4-A674-ADB2-B1F88C8D30E8","Travis","Brady",2419866808,"Aenean.eget.magna@blanditcongueIn.com","P.O. Box 600, 5047 Cras Av.","1515/0909/2009200920092009",4,"Ap #763-3168 Lacinia. Rd."),
						(54,"AHart","2AB4CB4F-F3E9-E69B-91E9-0FB510CB212D","Austin","Hart",3294547713,"libero.dui.nec@lacusAliquamrutrum.org","135-3750 Sit St.","0303/0303/2020202020202020",6,"125 Imperdiet St."),
						(55,"MGomez","117B87FD-74C5-6ECB-82AD-A142B4C8E21B","Merritt","Gomez",9325670108,"mus.Proin.vel@leoVivamus.ca","Ap #155-6985 Eu St.","2828/0707/2006200620062006",1,"P.O. Box 622, 6952 Non, Rd."),
						(56,"DBurke","C430EE82-7B13-BDCB-6663-4D9AD70287C4","Dante","Burke",3296322226,"ornare.libero.at@Morbivehicula.net","875-8367 Mi. Rd.","2929/0202/2020202020202020",6,"P.O. Box 281, 802 Ipsum. Rd."),
						(57,"JKelley","7331CF06-4967-3449-B6AE-880C0DE79801","Jenette","Kelley",3979877705,"cursus.et.magna@quisturpisvitae.com","Ap #528-9955 Ac St.","2828/0404/2013201320132013",4,"466-9735 Ultrices. St."),
						(58,"JRobinson","7D1B2521-7595-EFBC-4DDD-4CB7370BFA33","Jena","Robinson",2895536713,"a.odio@magnaatortor.ca","P.O. Box 444, 168 Arcu Ave","1616/0303/2014201420142014",2,"7006 Nunc Ave"),
						(59,"BMcintyre","EF43D558-EE43-CB8C-FAFC-B86B393FD9BD","Bert","Mcintyre",8749902581,"at.pretium.aliquet@Pellentesqueut.ca","P.O. Box 335, 5072 Malesuada St.","1414/0606/2013201320132013",6,"Ap #608-7799 Neque. Rd."),
						(60,"ATillman","7030E5BF-BE77-2367-3B96-FED4079F17E8","Aileen","Tillman",6915062340,"magnis.dis.parturient@egetmassa.org","P.O. Box 986, 3549 Erat Street","0606/0202/2013201320132013",3,"9750 Dolor Ave");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(61,"JAustin","F6DD62BC-7E86-6D7D-37E4-8EB8BB68C608","Jayme","Austin",4836118785,"tempor.lorem@eu.net","546-5684 Leo. Ave","1414/0505/2018201820182018",6,"1532 Luctus St."),
						(62,"BColeman","5FE693D5-6C84-DF5C-BC1A-A08328F4CF11","Barry","Coleman",7950864844,"scelerisque@liberoMorbi.co.uk","569-866 Erat. Rd.","2424/0909/2011201120112011",5,"P.O. Box 840, 6426 Ipsum Avenue"),
						(63,"SBaker","EBDC585B-021C-6263-72BC-29458AA01F09","Sara","Baker",5172994629,"luctus@etmalesuada.co.uk","133-647 Dolor Ave","1414/0707/2021202120212021",5,"P.O. Box 217, 3528 Proin Av."),
						(64,"ELowe","40FAA5C7-D68F-5AF8-C332-24354B31CC0A","Eden","Lowe",6197095004,"Sed@tinciduntorci.com","708-774 Diam Av.","0202/1212/2011201120112011",5,"Ap #331-7645 Pede, Av."),
						(65,"NVang","FC72F738-B78F-DF63-6649-8D85D28812A4","Nash","Vang",5407559495,"bibendum.sed@nonummyultriciesornare.ca","P.O. Box 885, 9043 Eu St.","0909/0303/2021202120212021",3,"3084 Turpis. Road"),
						(66,"LBush","31F99A36-E070-3ED7-953C-21838847E25C","Linus","Bush",6621145095,"erat.neque@cursusNuncmauris.co.uk","Ap #191-5191 Nulla St.","0707/0101/2006200620062006",4,"3468 Proin Rd."),
						(67,"WMiranda","90E4B157-F12C-027E-C1C4-510E575B2783","Wendy","Miranda",7440984695,"luctus@enimSuspendissealiquet.com","P.O. Box 259, 9092 Mi Road","1515/0505/2013201320132013",2,"Ap #240-1041 Eget Avenue"),
						(68,"EFinley","AAED62C3-3E23-27EF-B12E-350A52A9FD40","Elvis","Finley",8397263789,"nisl@enim.com","775-109 Blandit St.","1515/0404/2019201920192019",3,"659-4537 Posuere Street"),
						(69,"CPotts","CD453A6B-2FE0-73E1-570A-7A6CBBB2ED29","Ciara","Potts",3741316933,"Mauris.ut@interdumlibero.net","960 Nunc St.","2727/1212/2017201720172017",3,"P.O. Box 320, 6081 Vel Ave"),
						(70,"SWhitehead","F3361E11-7DA6-1DBD-A999-1326916215ED","Shannon","Whitehead",6941850361,"ut.pharetra.sed@velnislQuisque.edu","790-2127 Ipsum Street","0808/0606/2011201120112011",4,"8966 Sed Av.");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(71,"Channing","8F7807B9-624D-D222-741D-454B374F9241","Ferris","Whitaker",7698045822,"nec.tempus@turpisegestas.co.uk","785-3424 Lorem. Ave","2828/0101/2012201220122012",4,"Ap #100-8972 Amet Road"),
						(72,"Driscoll","1B166B9B-5EFF-9B2C-6C74-3EB16FF885DB","Kirsten","Herman",9189540016,"scelerisque@hendrerit.org","P.O. Box 905, 1331 Aenean Road","2727/1010/2015201520152015",3,"Ap #902-6594 Libero. Av."),
						(73,"Ross","BE77CC40-20F5-1456-4534-675AFB4A2E85","Ebony","Cortez",4704282688,"vel.vulputate.eu@leo.ca","470-4520 Metus Ave","0202/0202/2016201620162016",1,"872-5112 Felis Road"),
						(74,"Thor","D5E55DB7-FAF5-A31A-B37A-5893925870BB","Arthur","Lucas",2871913290,"quis@NullamnislMaecenas.org","337-5764 Eget Rd.","0808/0404/2011201120112011",1,"7785 Ut, Rd."),
						(75,"Sean","C943C65A-E832-274D-BF0C-C982A4387CE9","Rogan","Fry",9761992042,"Sed@congueaaliquet.edu","P.O. Box 179, 1392 Auctor Av.","1111/0606/2016201620162016",3,"666-6541 Ut Avenue"),
						(76,"Branden","D0449DAE-F409-7A7A-E4C5-C115DA8FDD27","Vivian","Patton",5936450748,"tincidunt.Donec.vitae@massaMauris.ca","P.O. Box 141, 3427 Fermentum Road","1313/0202/2020202020202020",3,"9255 Vehicula Rd."),
						(77,"Stacey","17F193A7-D4E8-82DA-DC23-9BAD194215EA","Lewis","Good",2122039476,"eros@idenim.com","Ap #581-4627 Et, Rd.","0606/0909/2014201420142014",3,"5086 Suspendisse Street"),
						(78,"Rebecca","C085FAB0-26B1-48BF-1CF9-FDB7A7B2208B","Anastasia","Tucker",2536901734,"gravida.mauris.ut@montesnascetur.org","4921 Duis Street","1717/1111/2011201120112011",6,"9020 Ipsum Street"),
						(79,"Deirdre","599EB1B4-0314-1F25-2384-8784CB1E6A9D","Beverly","Golden",8771001307,"ipsum.Suspendisse.sagittis@orciconsectetuereuismod.co.uk","6783 Mi Road","0202/1010/2013201320132013",1,"214-5331 Sed Ave"),
						(80,"Fulton","198201B3-0689-FAD5-90FF-302E518A9884","Portia","Finley",7917272896,"lobortis@mauriselitdictum.com","645-810 Varius St.","0909/0808/2021202120212021",1,"P.O. Box 996, 7590 Dictum. Road");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(81,"GAdams","573C4F99-459C-67AD-CFD1-CE70B8E573DD","Gwendolyn","Adams",3316540416,"Aenean.euismod@arcu.org","P.O. Box 919, 2409 Non St.","1313/1212/2006200620062006",4,"Ap #571-6084 Nibh. Street"),
						(82,"KDuffy","22FD1D9D-4CA8-E845-ED30-CA52C366A4A1","Kalia","Duffy",4186811212,"Maecenas.iaculis.aliquet@sitamet.com","2123 Nunc Ave","1212/0808/2018201820182018",2,"Ap #913-6598 Sed St."),
						(83,"HOdom","B9C8E1F4-AB38-C1AB-0651-3C3228A67294","Hyatt","Odom",8144669254,"lectus.a@lectus.ca","634-3558 Elementum, Road","0404/0909/2016201620162016",2,"P.O. Box 277, 9281 Donec Street"),
						(84,"JParker","305E71A9-F3EF-0F49-AB0E-000B68972D51","Jordan","Parker",2881848460,"Curae.Donec@atrisusNunc.net","467-9335 Adipiscing St.","1515/0606/2015201520152015",4,"P.O. Box 593, 5184 Ante St."),
						(85,"KAustin","EC681CF3-C26B-598B-633B-C84533582DC6","Kay","Austin",9457732958,"nibh.enim.gravida@et.com","309-204 Egestas Rd.","0202/1111/2008200820082008",2,"Ap #919-258 Magna. Rd."),
						(86,"AAnderson","4492E24A-B8A7-1B31-BAAE-EEF57AB5E4D0","Alfreda","Anderson",6298371651,"nec.urna.et@aliquetdiamSed.net","5272 Enim. Ave","1111/0909/2017201720172017",4,"Ap #767-2349 Tellus Street"),
						(87,"TClay","4AC91A61-C311-CD81-8D1F-F5A8A311F54B","Tamekah","Clay",9775097258,"pellentesque@necmollis.ca","P.O. Box 207, 3732 Eget St.","0202/1111/2010201020102010",6,"8416 Vivamus St."),
						(88,"HPugh","BB035880-3BA0-E666-6852-0773F64C2421","Hiram","Pugh",9229732424,"Praesent.interdum@egetvarius.org","6995 Arcu. Av.","0606/0202/2015201520152015",5,"P.O. Box 549, 807 Natoque Av."),
						(89,"MBurnett","3F9CC463-37E1-CE4D-4CBF-B9CC432ED0FE","Maryam","Burnett",9829885912,"Phasellus@velarcu.edu","P.O. Box 277, 5542 At, Ave","1818/0808/2009200920092009",6,"373-7972 Vulputate Road"),
						(90,"LGuthrie","B12E53EA-F6AD-05CF-5883-0D398E3B2B6D","Lamar","Guthrie",7481001868,"Donec.non.justo@tortordictumeu.com","3193 Lorem Street","0808/1111/2019201920192019",4,"197-7147 Ante, Ave");

INSERT INTO 'Students'  ('Id','Username','Password','FirstName','LastName','AMKA','Email','PhoneNumber','Birthdate','SchoolClassId','Address') VALUES 
						(91,"KFoster","A52A5342-4E0D-5829-83D6-0C43A57D0C49","Kasper","Foster",9373587789,"neque@lectusante.org","Ap #407-2079 Pede Av.","0404/0707/2013201320132013",5,"P.O. Box 572, 9402 Risus. Rd."),
						(92,"BEdwards","DEC3E946-897E-D4F9-FF71-94794722671E","Brett","Edwards",9324200908,"blandit.mattis.Cras@nequetellusimperdiet.ca","572-9220 Rhoncus. Ave","0707/0505/2006200620062006",1,"697-3921 Tempor St."),
						(93,"NHardy","608EED69-C009-506F-E962-25D4A78C461D","Nigel","Hardy",4169211400,"parturient@malesuadavelconvallis.net","794-8535 Lorem. Ave","2828/0303/2019201920192019",6,"658-1075 Laoreet Av."),
						(94,"VLawson","B76B7E4D-F0BA-093A-0AE5-EEEBF8B5A471","Vivian","Lawson",2311053913,"felis.Donec@volutpat.net","247-8458 Diam St.","1717/0404/2014201420142014",2,"Ap #365-796 Metus Avenue"),
						(95,"SRoberts","464881D3-7796-6865-35C2-2BB785096068","Shafira","Roberts",9885024329,"pretium.neque.Morbi@famesacturpis.co.uk","1414 Proin Rd.","1414/1010/2016201620162016",1,"P.O. Box 531, 5813 Dictum St."),
						(96,"AChristensen","D877254E-35E0-52F7-410A-987266E151CB","Ahmed","Christensen",4576081546,"condimentum.eget@elementumpurusaccumsan.edu","P.O. Box 171, 9762 Mus. Rd.","1717/0909/2020202020202020",1,"P.O. Box 205, 7564 In Road"),
						(97,"GJames","8A8FAC9D-7444-1D21-AF9E-1531C7B3EB78","Garrison","James",8290211256,"lectus.pede@felisullamcorperviverra.co.uk","553-1740 Curabitur Road","1818/0101/2006200620062006",3,"286-1558 Donec St."),
						(98,"CFaulkner","1DBD33D8-527B-6CFD-674D-16A800BAFB9D","Cora","Faulkner",1458553301,"velit.dui@eueleifendnec.org","6198 Fringilla, St.","0404/0303/2020202020202020",5,"7195 Eget, Ave"),
						(99,"MBlankenship","45FCEE01-9A7F-9CE6-296E-2CAB33E46B3D","Moses","Blankenship",5525363349,"sem@pedeet.ca","Ap #459-7059 Ac Rd.","0909/0101/2022202220222022",2,"Ap #933-4366 Egestas. St."),
						(100,"DEstrada","A0653861-9A55-29B3-6DC2-FB5B48DC4162","Dante","Estrada",2263195833,"felis.adipiscing.fringilla@accumsanconvallisante.net","P.O. Box 294, 3410 Maecenas Road","3030/0707/2015201520152015",1,"100-3662 Nunc St.");
SELECT * FROM Students;



