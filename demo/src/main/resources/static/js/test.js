(function () {
"use strict";  //  Safe wrapper for use strict.

	var app = {};

	$().ready(function () {
		app.doms();
		app.funcs();
		app.events();
	});

	app.doms = function() {
		app.doms.$btnSave1 = $('#submitButton1'); // submit form normal
		app.doms.$btnSave2 = $('#submitButton2'); // submit by ajax form
		app.doms.$testForm = $('#testForm');
		app.doms.$dialog = $('#dialog');
	};

	app.events = function() {
		app.doms.$btnSave2.click(function() {
			app.funcs.submitTest();
		});
	};

	app.funcs = function() {
		app.funcs.submitTest = function() {
			var formData = app.doms.$testForm.serialize();

			 $.ajax({
                 type: 'post',
                 url: '/submitTest',
                 data: formData,
                 success: function (message) {
                	 app.doms.$dialog.find('p').text(message);
                	 app.doms.$dialog.dialog();
                 }
             });
		};

	};
	
}()); /* End use strict. */