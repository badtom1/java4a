response.setIntHeader("Refresh", 1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		PrintWriter out = response.getWriter();
		String title = "Auto Page Refresh using servlet";
		out.println("<html>\n"+"<body bgcolor = \"#f0f0f0\">\n"+"<h1 align=\"center\">"+title+"</h1>\n"+"<p align=\"center\">Current Time is : "+dateFormat.format(date)+"</p>");
