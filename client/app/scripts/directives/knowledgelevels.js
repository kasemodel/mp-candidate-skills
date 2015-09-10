;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('knowledgelevels', knowledgelevels);

	function knowledgelevels() {
console.log('foi');
	    return {
			template: '<div></div>',
			restrict: 'E',
			scope: {
				knowledge: '=',
			},
			link: function postLink(scope, element, attrs) {
				var nLevels = 11; // 0 ~ 10
				var htmlText = '<div class="btn-group" data-toggle="buttons">';
				function appendKnowledgeLevel(level) {
					return '<label class="btn btn-default">'
						 + '  <input type="radio" id="' + level + '" name="level" value="' + level + '" /> ' + level
						 + '</label>';
				}
console.log('---x---x---x---');
				for (var level = 0; level <= nLevels; level++) {
console.log('level: [' + level + ']');
					htmlText += appendKnowledgeLevel(level);
				}
				htmlText += '</div>';

console.log(htmlText);
console.log('---x---x---x---');

				element.html(htmlText);
			}
	    }
	}
})();
