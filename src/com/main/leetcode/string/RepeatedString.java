/**
 * 
 */
package com.main.leetcode.string;

/**
 * @author amruta.kajrekar
 * leetcode problem #459
 * 
 * Repeated Substring Pattern
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False

Example 3:
Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class RepeatedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RepeatedString repeat = new RepeatedString();
		System.out.println(repeat.repeatedSubstringPattern("aaaaaaaaaaaaaaaaaaaaa"));
//				("xcehqjjzxokrsyhwdzbvzjyyxubvzmihdwiafigdbblmjqzvcwzzycrasyrgcaassibiaactwivetopqwaulhhzuppqqoplkzxyrrijpymnasrdnqjyikqhdsipknsiyifmrkbzaentukhznjmfjugfagoxxxwkhaxsgipnfafufeefewmrrnocxliemwikquvisezesjfxstitzscjsbhxjctyfnqvndxrpwpjvoovswopoaluhxfrsgjtyxaqobhbffmsitxdzqlmfvxooitiyujywumwvaysizobqulpftwwhyufkvjvmxdlzjhkqfnzavpfsbevubrrqnfrqbdasnqquhjddpeerkpumdllpcoqypdoconxarzececsnkqdpcgtroodsdwvgvkchvgjteegvfgkmfykpswdmxlbkjfdlmwejeoysgnrdtuyxiyacoduxmnlllkpufaevposxpqrpeleetfcyenydhsffgzxfzsqusyujkxdqzlpwtxktegcfcmdponmaruwevmohzkocohxipxpiitsvbiykvqwuoavbqoifqqazdjgrjlmyabiotliaycqckpmmzsnipeqzsvuribfsogfsjbsimhcquouxjafbmibbjgcgelmgurgmdfmqivhcvnxkpobvvzxtryzcufogtwbecjkhtpllnzmhukxvpjijrulwvohmeyumqyiicrjklyipqhiaqfphiuqskhlgyktdvyoafuvzcltmhwsbqmvbqntgxjqchgcbtbirgacqltrterozwvupltxbdvbqfkocbwhsiinmukecljqakisdnwjujzsbyojuhxxxjexayixymkbfcxocyapflvplzhgecudqixjggytolethkuseqqtwrsarsithmkxbiebniyyxcdopidinwxdtuuhvsyetgwbsxdyukikexhiynlwtdqayigcfwzimznwxyxwdpaygeivrsiykvwaqmhqldnztqptpulchyzmincpjhliechtzowdfdxmngmqfsrkrpuzuaijwanejwqtuevxqlxjnlsdomhymuecllhtvgvixwywkubfropnjqalntwzartrxobteswwegawxsrqnpvjvgwyjxriskgwzqufmlwetpkkorfnewexveiifsfgqwazpoxlmsqdbkgpihqclthiiodwvqdkvoymytbmpqdcmjmkwxhpswownsysnxcoeooiiyycyrcxpuqygqpulgvpiadtxyhfewvagujbxzeudbrhqavziqiisauagsgdkujhdbrqvtezvrnxybyssiboacmpssxepszclmxhbmqzjqznnvysynngeidrxhvwaperolxemqlmbsqxwlhlolswyvfrllwmaacpmnrfslbjhhybnvjugsvussncgpxteogdmghzfdykziczfkhchbvnlaqfabupztxvoybchelbhsanfhboeiekqosdqdofzygstuwdehwrdxitfvuyenkbjzoyesfmuxfmmddpbpegopqebbtdzdojlnyweadolxilcfemjziexfnhdgwgvzpeqllqchtwhcccscdjiqslagldqtrgfvwomeooipewajotonbahtilfxsgxbayxuqbgtoaqymxozfafhatzobwriyisakbokpsrlzvqfgdnfamkpgxoyynjjhtfpifsbfqkwhzhqrwpufvqlalxbglunpldqaegszlemuotvusnnuybtuapibbslnbfrrvngxnjasitodjoxkizqnzhbqpipmeasacpnkwmiulogalbkfcnyukmbowrunipagbwebricpyzlvsodkuebwctbphpepoapboyjdusvudrjvdmxckjxvjcfmqmqlhlmxtbwwholkfapaoqrtdydccawsxjpyrjjkhsuiztzrxueiyafmhkqxfbewldcxbndvmexxrotgwgqcgoqbeicjixgbztlpbtdxzpmvmfxcziyquixdodwylvwodlpgzrewglagroosfllpkzumtpwhqjedgzirrhzunixgsmfiwlmvchgfyhkwrkhlerusekslezdlrxtfjqlvevmahjgwnlhwbddqkauqqgwttanikwndrtpucfoovsuoehgowmcwjvrzawtvbkflxrzkszbhlynectaysgnjyrcbuxyinifgxhmpklmgkqqkjekjgqtjyxfdplbtkjtjsoopvstrwaanvstklllaqrxgqxulvehztzkdbkwfcdiieyhxyppjnfmeioucvmwcdoepwblvunncxbdpmmsrknebzwlqhazaowskbmevpvfubbzxvkovcendsodnpueomacdispdbpzdxoelfkbsgdxebslgpfknvosenykcrlraoqfszpcrwqoxvgtrmxbvbsmakncevqlqthfdskkkwyelzdvlqacwldmjpybsunerdsgyotbzpsetjgwhicbdybrtkleeyncysoascwuupiiqnznqpenmotoxjrwgckftlhtmagkebozwvdmdwwlkuvwjlahpxmuzmwhyygfqicjpekejseqlifdrmeokteeorzbhzrnykjohjoctceuqnqhsnfistitgebriojdtvmozwbpwnbwsqxtherxuwjwhkqlkqfsqtrbyiszejkrqpbvzpvlnsmfpprpyhxhpzkvypljprsrcfpfzvhiqoemtokuujqvhlutepirglffdrwlfjivjwynoxzhokxznffrousvdzktsvfpxdhtqqpumoxgwnbhqzzdqlbllvvowwvhgegiqkfmfvyvjlomowgjxjtzlgihoxqzgivwbkudrhlyfpcloaudhrwwaklhmisjzsjqozsaknzhenwrbnchxcrzxskdznhzpipkoaykicivksowbrajweyqnzyoqfhcelofsyqoxpdqivkadeussexpxhasnedxclaubunhjtrajnqzhpfsyiprvgjfeqawlcnwpzxdprcibcbhrrnqyrjqkzellpgyxivtgflcvdvmalsbiodpixoyomnvrbtjviutcialbuaqtnpkrzoqopwzqalgujegzgxucsapqlolsmrngtxcjzwpoqvtsomneasbxroknhlkpnjdrlwgxgvnctnbtkdyblhhhnqckvgwdzfdaxyjarbzxyikazgmfcmvbeircabwownjdfursushizupjcmxympafdiuzdeaopkqqekyhoxaldgrqwfqkletgrnnmmzbswnaloxlznepiqofdqsnmorkqpthnnuhfcrexmgjemjimmgnauvuwsdtsdrdxgpieqxcrtwaqrpxfolhevdtkbndztrtijfsvrdgrcpewiyciqkieozsahmfmhdzadmuumjawzmjskprqbxlhvntswcwfryzbgmiaxohtfbdguuptuncztaarfxkwxgwafzrcevwzvswewwgogwhszxpyakutpflabugfjwraaekuaverybirkesxsbrgphxsyqaazddtumsxaiuyidjelbtvosuxrjadpivczntmrrkgvazfnngwxksmdhlzcaboocfaadcanmqtrjnzqmnkvpoasrbazbivnywnjjixvgffoaawwcelxeelvvsujjrlfvbjucggvmwpuuzxqfmzkfmvrysekqgkxxsyiidrsfgpbgkbxxzngebjpjafhvjumacneyrwmfmuhmuudxzjvwmqgdmzyvxhsyeibcamupbopfnzofvhvrhiajwwhaekrixbdgjrwixhfrvadhdijrlikhgoinpcnsshjlvquajejkyfdkafluhociuppcfnatjhbegsdgvybciiuqfifpdnzhrwqcatklwrzsfaapxlxtsfrsnsbsdanfledcpbjjqmiiqdzemhbrnwykjwpdzmrtnxtptapmtpanqbqkcpoyrsolucjcvlmqoheahkknbzaenflaeioioewxaojlarqbtrtmbyvtzvjivjdrzxfufbgmyfcuvbdhavuhjzqrqkgjyxfljffmnmbracgszqseutbqttbwmqtuqbcxfprgijjruqlaqxkzjhzrlfymnltjbffmemcwcbszkbdfczipgvjpafwtdkaiqoqnftpilcwgqjgmlqwjjkdvvonynyqwvlpksuxjbkubejstarpclvbzoohqtwugmwbfjwmggbrnnefkcqibmpptotmscqnrodjjcmikwsguilwgygopvltpeaxckcshbfymgyryluyojdmtwkbbobhvnrgkyzehdhthkrsrznkbaetarnovyzfymfezkmnsqjptusgjpycqhdvecnydzffkyckpdolfeanlfkcqwtzqioglhbynqxbdldjegmdiimvipumxstpawgmsulslblxvxmzlrqllcbfqtbhretgbosvlwelcjpbuxwyivppqmvhzydfksgbdtzpklrpxslvsgwqzviwylnuxbnlohieofltrsktwogvwrlklheyvxlfphaifsxqxrgoyhzqpvicabgvptfgklhqupwanegqvonvrxvvdzgojymdmqvyiccpvcildwqspmlyrjgxhmzplnktvskzczswisqpgpiaoxwyssagrehagwjtiszbbhhichfuvxrnolnvrttfhzoomhtxjjvldyhtdswpknixsdotqdiygxenidwhhaosfiqrgozdwqshzgoiuuiciutuvudfhpxllwcztxmlwqozrnriyzahqiylcsquzcpnirqrsnqvjwapsfamilkfbghfojborrmrjsfgbjklcuafkdjwkpuerosbwcozlwuivchbbtuqjwegjqowmscipmetpuixftcgxogjipqlveriakswyrgldzqxoxzkjfanvfrogrvhoahmfmmgmaejvulwfzfwlzihnwvgwlgozenoudossiecpbyokqvojpptihnymqczqcambfvadnkbeuhtvxrlebaboavxkhpzcrgjwvzdtutiqaxlayxdxeeewnyhbyernerroynsoelfnujdcrhhmetzhzwtkmuqrgoovefjqnidvtsmttbxtrdsuzqszfckxrfstamggnkrwabbgarzjiedjveiwkgzfxysidajnsbnmttufcjmtanuijxcwohmfhrskrfyzxtnyvvruuujpanhmnspsnoptlfmkhiabchviicqktkkdewvnatmfcmwxtfhonimslzxjcvyxkhusqdomzrsuvfavhmjsnnbxagykjkihtycjbptqffbbxhyjtvwcdkxzrkqajlifcmdpcsftbcucnaakegfxyjdnsyhlhuqoxrclswtehxsfelzxvumslcxwcvwsachbgcpjjzypbfjfsqcxsxrjmefxarishqjaymxnxktsjxiaukyydyttwpraujtttlqadvktmprvjudlvexrsquklmbuprporjcfpckemhqqunroybmneokuohyecfbvobbxtajdyzzomiqznhhazifdvntwujskhomrydaflaxkwqlemfvxcmnjvbojokgukoyqxrelqymnoldnxckinyozdpjqknidckzdarufuhpvyneeywvfsiqfaygztpfhlnmaspnjuqtexnwjeivhzgtwmyqdqihrvelbqyrqtvteizkbefyxuxkuqtzubixhrxpvvvzgcnxfitlkmyvjwtypdwekvqshnbwgaswjquscweiuzfqikuqordfysuxpgcwouggpfbmvektywreyvnqinwdootyfmgmdkunuwktnlryqtgodgbdlxwemhbdidfabyullaoordbiruhjvxuopdxltinbivepxfclbuuokvlsltfxupdemdynkyfxrwgjkrqsfcbyatjpsnpbjsjslfycosajfkhxsrzjllgnkdcxahwevdtnhnootkcitcigqwfmmuzedwkwfrjeaplwdabkmsrnneekjiewzlpkefluysqfwukwyyujclkauiryatticaijgfqcecsjbawzmvzkahkcfalmluohcndujsyqhthhpibtnpagfbdzddavmxyapsgilbuescvmbmhjmoxgojzrhcijhbdxsldwmrkdmweimdhepadynwwckzcvgmolampsmdzygwwxxhmleabyckrnnkamimcdvflrljoynilxfcoiolfvzpnxtrsefodtwjxeijdonenvoeeuqofzbxpqbbueiifcefogqikwlxkfpwevejlqmakjsahbytoqbsunoidlldlcrejcpzlonahvtcmnhuhpnmymlqqaiyppmtflunrylgbjkmdnhjyoxepfcfvkqewbdlxjcpxflvvcftdzmjmcnqqokpdigfqvrtwqurtwlgtfcjejpnyvecowbnlatfqiylgaluieepgrgpvhsfnhcdhxyzocxftwwnrehbvcvstikfdyhqflocegenjtgrzbmhtxfaobeihihtjbzgysuqqgfcgzflkhpzxqwqjhaaadgnbxycflytgikfdfnxzrurehokiiwrpjbcivixusvkqycpbyyxilyvqtgxwjowghkdwlsrbmzpsnruzlqnuzwpgibshexrdahdnavnhknhrrdoolqsijrnzzhnxpmsfrzpndvhtnxhwwhziuhsoaskrjmahbqelpksbjqronrvpktfvnchcxnjekvywfqtyiumbpjyvpgyvqiinqzrdyogrvdqethxmfcqmrdnznjzaxtkzvjfnmhhsclpydwaajvjtqnzemfkydmiomuecesdygdfqoyevrhhsjbykoobbrtgqhylpgrcweerhaoovvvwxmqpetqpigmtjajxgutwjrtscopqoefijoepmxaysbtzwkpytrzbeasaxbxldsegivvsybclrycifdizwjblybivsmzxfljrhrplatliiohbkjrneuymamlqdfdbsrioxnvynoxbimyiqfmtyxpddfviasrjaxpvclzfrgdlzbjwwdgycwicdotsrgzjxhoivnxtxjnkidtnygkcvtczgmypdcmxhjucepxscvzhwevutpkpvlufmwydgjgkbktdwanzxmfsiuqqdjzofmhxkoohwxkdibxjsdjraezszxpdgrcjismaqgplsfwsuxjtlqhdafkpicerlxxharntkuxdzvwzhdeztobatvopdnxywwhbtirodbiphdgioqroxuxdlmmfummnqaqziobgvlsxaoluwladhyqlztvrmujzpxuamjgppsaybaqafokonyegopwyllukrkoxqkyzxlxfvtcysiurzhsyilmtlvxnlukpdhohewsdzezesoimpahkzhfrgzqwahisfgjhklwnnsrkcahophsesmfbnbgfmxmjjmlabeujvuxnbziywknmqlpymtxulcunnkcyjnlcsmhquufvxhskwarbgvoejavbexeiybssfksyymojxacuijsxjqmrifjfqmdiufcunaaabnczyxtnsxipxfvuielrzluzzqiqzhpumeqwctutqxariauwotkxuivzeofpbdbflmxwdemxqqeuqmhbvybyfoskrgksuwcwqqonbrkoraltgpxojvynzudszgkwkgpqlrcgeqouvhngxottvhnduygkgwuvejzbztagajgmbrqtwdcxffavgaddccpyggrxxmysyzbkknsoccqxzrujmkwxvhrdoguluswwfrwmwvstngrzsgdcwixygihwizbueedkwehleoqubecjxplsywrcwuzbnzspmywjosixfkisvlghhgfgnxxzhsxqiockoncvlnlibiwsgguvkuvztkstbxwozzbudzurikrgjfxhlkiknxclwzhzjbxknwtdbmxwdabkcburxnnrfignupsektizqhiuvzjtzooekkozmdvlrumvfejcgptzqwbqdfvvjhfpgphyeauorgnvfvjthufgnhjdmviwpafqeojbslyrukimnnreodxfsqksfcjwcguisoghdyrjmuertinqhepawfjykzrhtxmlvyjwhfsaezhmaxkytvzvnydnocivwuwlagdmhvfepidsfmhdwefsxyytscppnblswhzfemtvfkdomwixynolekfqdqlvurnwpzuoyieydktsnruompftwywjwbhthrjodclkqdimgeytmmqdoflvxobbvmhfczplshmpdbrozugnepnbgbsiltfijclsvdcccdahsozomqhdrswbqsrktmzfoctiohijypxwldcyptebewhknixnbpnferbnxckkuuiofjgjcoxnatxiyswyfnpxqzvmdvmjbpyoqcfxcjkwceqeadtoywyxpoqvtymxwnldyaatsallqbsugoffuhxzirubppsyqodczmnpxjblphpsvugvmwpinzvlpbuzdiwyqbgoifhxwihibqjouiormkrsfhisiopmgiychlptqfdcwmatbhrcnkgxwhwjlljtrxokhtjgkisqsiqtoiiujbxaqoilpofoutxvnwdkrziiclfymligibjcgziwiouaytmthcmsyieclhnnazwiaocgalfdfudmsxndzzfqlpxmxtidueakhtgdcyvsdtkjoyxiikejocnpyzmqgpbecekyxfmvwjcqvjakaoxscwkwicthsurbqwuqlkoisexdzdutkobteuzrloklmzmcheylkqmsrlgdonqbqzdmmefbkqczxnjjqtwupuemrdslnmssrabjxjntmsipxkrfslhlzmitynqwsrlyoiriuadujhfabvakbwhxwsoshjuaxbwedmimrheakfenahrcjqpvrdaufsbqbcziwmaotcmhftfjzfwbycmyuqnsvhtygdkbeqbtspdaknmvofekvkoofiddagozekygcaqvzideubnrgktdzqipitcptefmssilgetcplmesjennciethmnzxfnanwdcabwawlutrbnwfodckxxanpfwttjuqsbeevciultyfvpptehoeqistnsxbgzoixfpcyrwgsvdnydbzsogwzmbqaazpbhqnphprqztdkdkbijlacuezbcmfeulmhkdnmovkehfaqiqltemhjthjbguaacdncprtcndlysxwzjnwplwfnkeujuzdpkktyaijfpddhurnacgllovqdikqbnuhtjrghylzrrywgxmabjmxkxeopjggqgjcsaimy"));
	}

	public boolean repeatedSubstringPattern(String s) {
		if(s==null || s.isEmpty() || s.length() <2)
			return false;
		
		if(s.length()==2 && (s.charAt(0)==s.charAt(1))){
			return true;
		}
		//for all same characters return true;
		int k=0;
		boolean allSame = false;
		while(k < s.length()){
			if(s.charAt(0) == s.charAt(k))
				allSame = true; 
			else{
				allSame = false;
				break;
			}
			k++;
		}
		if(allSame){
			return true;
		}else{
			int len = s.length();
			for (int i = len/2; i >=1; i--) {
				if(len%i!=0) return false;
//				if(len%i==0)
				else{
					int m= len/i;
					String sub = s.substring(0,i);
					StringBuilder sb = new StringBuilder();
					for (int j = 0; j < m; j++) {
						sb.append(sub);
					}
					if(sb.toString().equals(s)) return true;
			}
		}
				}
		return false;
    }
	
	public boolean repeatedSubstringPattern2(String str) {
		int l = str.length();
		for(int i=l/2;i>=1;i--) {
			if(l%i==0) {
				int m = l/i;
				String subS = str.substring(0,i);
				StringBuilder sb = new StringBuilder();
				for(int j=0;j<m;j++) {
					sb.append(subS);
				}
				if(sb.toString().equals(str)) return true;
			}
		}
		return false;
	}
}
