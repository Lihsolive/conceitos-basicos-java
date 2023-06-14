package ada;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class UsandoDatas {

	public static void main(String[] args) {

		String nome = "Liliam";
		
		// ISO 8601 - padrão mundial de representação de datas, em Java acontece através do LocalDate
		
		//para mostrar a data atual a partir das informações locais
		LocalDate hoje = LocalDate.now();
		
		//para traduzir a data
		Locale brasil = new Locale("pt", "BR");
		System.out.println(hoje);
		//a saída será o dia do mês, que no caso foi 2023-06-14.
		
		//para formatar a data do mês
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' YYY", new Locale("pt", "BR"));
		String formatarData = hoje.format(formatar);
		System.out.println(formatarData);
		//a saída será: 14 de junho de 2023
		
		//para formatar a data da semana, traduzida para o português
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		String saudacao;
		
		//variável para obter a hora atual
		LocalDateTime agora = LocalDateTime.now();
		
		//condicional para que a saudação aconteça de acordo com o horário
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia";
		} else if (agora.getHour() >=12 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		} else if (agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa noite";
		} else {
			saudacao = "Olá.";
		}
		
		System.out.printf("%nOlá, %s! Hoje é %s, %s. %n %s!", nome.toUpperCase(), diaSemana, formatarData, saudacao);
		//a saída no console será: Olá, LILIAM! Hoje é quarta-feira, boa tarde.
	}
}
