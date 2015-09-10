;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('knowledgeLevel', knowledgeLevel)

	function knowledgeLevel() {
/*
		return {
			templateUrl: '../views/knowledgelevel.html',
			restrict: 'E',
			scope: {
				user: '='
			},
			link: function postLink(scope, element, attrs) {
				//element.text('this is the knowledgeLevel directive');
			}
		}
*/
		return {
			template: '<div></div>',
			restrict: 'E',
			scope: {
				level: '=',
				levelSelected: '='
			},
			link: function postLink(scope, element, attrs) {
				var level = scope.level;
				var htmlText = '<label class="btn btn-default">'
							 + '  <input type="radio" id="' + level + '" name="level" value="' + level + '" /> ' + level
							 + '</label>';
				element.html(htmlText);
			}
		}

	}
})();