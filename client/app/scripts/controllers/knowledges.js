;(function() {
	'use strict';

	angular.module('clientApp')
	  .controller('KnowledgesCtrl', KnowledgesCtrl);

	function KnowledgesCtrl() {
		var self = this;

		self.knowledges = {
			html: {
				label: 'HTML'
			},
			css: {
				label: 'CSS'
			},
			javascript: {
				label: 'JavaScript'
			},
			python: {
				label: 'Python'
			},
			django: {
				label: 'Django'
			},
			devios: {
				label: 'Desenvolvimento iOS'
			},
			devandroid: {
				label: 'Desenvolvimento Android'
			}
		}
	}
})();
